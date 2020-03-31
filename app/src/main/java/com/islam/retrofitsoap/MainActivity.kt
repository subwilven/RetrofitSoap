package com.islam.retrofitsoap

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.islam.retrofitsoap.webservice.WeatherInterfaceApi
import com.islam.retrofitsoap.webservice.request.RequestBody
import com.islam.retrofitsoap.webservice.request.RequestEnvelope
import com.islam.retrofitsoap.webservice.request.RequestModel
import com.islam.retrofitsoap.webservice.response.response.ResponseEnvelope
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.simpleframework.xml.convert.AnnotationStrategy
import org.simpleframework.xml.core.Persister
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.webxml.com.cn/WebServices/")
            .addConverterFactory(
                SimpleXmlConverterFactory.createNonStrict(
                    Persister(AnnotationStrategy())
                )).client(httpClient.build())
            .build()

        val requestEnvelop = RequestEnvelope()
        val requestBody = RequestBody()
        val requestModel = RequestModel()
        requestModel.theCityName = "上海"
        requestModel.cityNameAttribute = "http://WebXml.com.cn/"
        requestBody.getWeatherbyCityName = requestModel
        requestEnvelop.body = requestBody
        retrofit.create(WeatherInterfaceApi::class.java).getWeatherbyCityName(requestEnvelop)
            .enqueue(object : Callback<ResponseEnvelope?> {
                override fun onResponse(
                    call: Call<ResponseEnvelope?>,
                    response: Response<ResponseEnvelope?>
                ) {
                    val responseEnvelope: ResponseEnvelope? = response.body()
                    if (responseEnvelope != null) {
                        textView.text =
                            responseEnvelope.body?.getWeatherbyCityNameResponse?.result.toString()
                    }
                }

                override fun onFailure(call: Call<ResponseEnvelope?>, t: Throwable) {
                    Log.e("getWeatherbyCityName", t.message)
                }
            })

    }}

fun test() {
    //        val logging = HttpLoggingInterceptor()
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
//        val httpClient = OkHttpClient.Builder()
//        httpClient.addInterceptor(logging)
//        val retrofit = Retrofit.Builder()
//           // .baseUrl("https://www.w3schools.com/xml/")
//            .addConverterFactory(
//                SimpleXmlConverterFactory.createNonStrict(
//                    Persister(AnnotationStrategy())
//                )).client(httpClient.build())
//            .build()

//        val request = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
//                "  <soap:Body>\n" +
//                "   <FahrenheitToCelsius xmlns=\"https://www.w3schools.com/xml/\">\n" +
//                "     <Fahrenheit>100</Fahrenheit>\n" +
//                "   </FahrenheitToCelsius>\n" +
//                "  </soap:Body>\n" +
//                "</soap:Envelope>"

    //  val requestBody = RequestBody.create("text/plain".toMediaTypeOrNull(), request);
//        retrofit.create(SoapApi::class.java).uploadRequest(requestBody)
//            .enqueue(object : Callback<Codebeautify> {
//                override fun onFailure(call: Call<Codebeautify>, t: Throwable) {
//                    t.printStackTrace()
//                }
//
//                override fun onResponse(
//                    call: Call<Codebeautify>,
//                    response: Response<Codebeautify>
//                ) {
//                }
//
//            })
}
