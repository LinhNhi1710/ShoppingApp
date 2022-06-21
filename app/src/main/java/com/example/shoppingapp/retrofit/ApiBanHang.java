package com.example.shoppingapp.retrofit;
import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import com.example.shoppingapp.model.LoaiSpModel;

public interface ApiBanHang {
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();

}
