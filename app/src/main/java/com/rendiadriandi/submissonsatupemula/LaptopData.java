package com.rendiadriandi.submissonsatupemula;

import java.util.ArrayList;

public class LaptopData {
    private static String[] laptopNames = {
            "Dell XPS 13",
            "Lenovo Yoga 920",
            "HP Spectre 360",
            "Asus ZenBook UX310UQ",
            "Apple Macbook Pro MLW82",
            "Huawei MateBook Pro 13",
            "Acer Aspire 3",
            "Samsung Odyssey",
            "Sony VAIO SVF14212SG",
            "Xiaomi Mi Notebook Air",
            "MSI GT73VR 7RE",
            "Axioo MyBook 14"
    };

    private static String[] laptopDetails = {
            "Dell XPS 13 9380 mengusung layar 13,3 inci yang menawarkan keseimbangan terbaik antara portabilitas dan fungsionalitas. Pasti masuk ke dalam tas dan tidak memakan banyak tempat, bisa digunakan dengan nyaman di meja kafe yang kecil sekalipun.",
            "Yoga 920 Bodinya mengusung material alumunium dengan tekstur mate, berpadu dengan engsel dari baja yang didesain mirip jam tangan. Dengan begitu notebook ini dimungkinkan untuk dipakai dalam empat pilihan mode; yakni versi standard, tent, stand, dan tablet.",
            "HP Spectre x360 13 ditenagai processor Intel Core generasi ke-8 yang lebih kencang dan efisien. Laptop hybrid dengan tenaga lebih besar ini memungkinkan Anda bisa bekerja lebih nyaman di dalam maupun di luar kantor.",
            "Asus Zenbook UX310UQ dibangun dengan casing metal yang kokoh dan di dukung oleh tekstur Zen yang mewah pada lid covernya. Dari sektor layar, laptop ini dibekali dengan bentang layar sebesar 13 inchi dengan resolusi Full HD 1920 x 1080 piksel.",
            "Apple Macbook Pro MLW82 terlihat elegan dan stylish, sama seperti produk buatan Apple lainnya. Ukuran layarnya yang besar, mencapai 15.6 inch tentu bakal memanjakan mata kamu. Apalagi tingkat resolusi layarnya juga tinggi, yakni beresolusi 2880 x 1800 pixels.",
            "Huawei Matebook 13 dilengkapi layar berukuran 13 inch dengan resolusi sebesar 2160 x 1440pixels serta kapasitasnya sebesar 512GB dan kecepatan prosesornya mencapai 1.8GHz.",
            "Acer Aspire 3 A315-41G-R38X ini adalah laptop yang sudah dibekali dengan AMD Ryzen R7 2700U. Terdapat prosesor 4 core dengan 8 threads. Prosesor tersebut memiliki kecepatan sampai 3.8GHz. Sokongan RAM 4 GB dan kartu grafis juga turut memengaruhi performa laptop ini.",
            "Layar Samsung Odyssey berukuran 15,6 inci dengan resolusi 1080p (Full HD) yang mendukung refresh rate hingga 144Hz disertai Nvidia G-Sync. RAM sebesar 16 GB serta storage SSD sebesar 256 GB dan HDD berkapasitas 1 TB.",
            "Sony VAIO SVF14212SG didesain bagi Anda penggemar musik. Hadir dengan fitur ClearAudio+ yang secara otomatis mengoptimalkan proses penyesuaian kualitas suara terbaik sesuai media yang dimainkan. Ditujukan sebagai komputasi rumah dan sekolah, VAIO Fit 14E sangat cocok sebagai teman aktifitas harian yang mengagumkan.",
            "Laptop Xiaomi Air hadir dengan layar dan teknologi layar adaptive, Laptop ini membawa foto dan video Anda menjadi lebih hidup. Notebook Xiaomi Air ditenagai mengguakan prosesor intel generasi ke-enam yaitu Intel Skylake i5-6200U, prosesor grafis Nvidia GeForce GT940MX dan digandeng dengan RAM 8GB DDR4.",
            "Pemilihan Core i7 6820HK untuk MSI GT73VR 6RE Titan memang bukan tanpa alasan. Dalam kondisi standar performa Core i7 6820HK memang tidak banyak berbeda dengan varian prosesor laptop lainnya. Prosesor ini justru tampil cemerlang saat di overclock dimana performanya menjadi sulit dibedakan dengan prosesor desktop sekalipun.",
            "Axioo MyBook 14 menghadirkan bentang layar 14 Inch yang cukup luas untuk membantu Anda meningkatkan produktivitas. Port konektivitas yang cukup lengkap memudahkan Anda untuk menghubungkan Laptop ke berbagai macam perangkat, seperti: Hard Disk eksternal, USB Drive, proyektor, dan lain sebagainya."
    };

    private static int[] laptopImage = {
            R.drawable.dell_xps,
            R.drawable.lenovo_yoga_920,
            R.drawable.hp_spectre,
            R.drawable.asus_zenbook,
            R.drawable.macbook_pro,
            R.drawable.huawei_matebook_x_pro,
            R.drawable.acer_aspire,
            R.drawable.samsung_odyssey,
            R.drawable.sony_vaio,
            R.drawable.xiaomi_mi_notebook_pro,
            R.drawable.msi_gt73vr,
            R.drawable.axioo_mybook
    };

    static ArrayList<Laptop> getListData(){
        ArrayList<Laptop> list = new ArrayList<>();
        for (int position = 0; position < laptopNames.length; position++){
            Laptop laptop = new Laptop();
            laptop.setName(laptopNames[position]);
            laptop.setDetail(laptopDetails[position]);
            laptop.setPhoto(laptopImage[position]);
            list.add(laptop);
        }
        return list;
    }
}
