package com.hlcsdev.x.exchangerates;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface CbAPI {

    @GET("Rates")
    Call<ArrayList<Rate>> getData(@Query("onDate") String dateReg,
                                  @Query("Periodicity") String a);

}
