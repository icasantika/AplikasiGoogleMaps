package ac.id.atmaluhur.mahasiswa1811500023.api;

import ac.id.atmaluhur.mahasiswa1811500023.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarkerHospital.php")
    Call<ListLocationModel> getHospital();

    @GET("JsonDisplayMarkerRestaurant.php")
    Call<ListLocationModel> getRestaurant();

    @GET("JsonDisplayMarkerSekolah.php")
    Call<ListLocationModel> getSekolah();
}
