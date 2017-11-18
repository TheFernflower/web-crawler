package windowGUI.component.workDB.restApi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.ArrayList;
/*
 * Интерфейс для описания запросов для получения(отправки) данных из таблицы Users, в REST-сервер
 * */
public interface RestApiForUsersTable {
/*
* <Получение>
* запросы с помощью которых, можно получить данные из БД
* */
    @GET("unauthorized/admin/ui/getAllUsers")
    Call<ArrayList<PojoUsers>> getListAllUsers();


/*
* </Получение>
* */

/*
* <Отправка>
* запросы с помощью которых, можно отправить данные в БД
* */
    @POST("login/")
    Call<ResponseBody> authorized(@Query("login") String logon, @Query("password") String password);

    @POST("unauthorized/admin/ui/addUser")
    Call<ResponseBody> addUser(@Query("login") String userLogin ,
                               @Query("admin") boolean userAdmin,
                               @Query("password") String userPassword,
                               @Query("active") boolean userActive);

/*
* </Отправка>
*/
}
