package h071241012;
import java.util.Date;

public interface IServiceable {
    boolean periksaKondisi();
    void lakukanService();
    Date getWaktuServiceBerikutnya();
    double hitungBiayaService();
}

