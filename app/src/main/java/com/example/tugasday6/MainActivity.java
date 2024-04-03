package com.example.tugasday6;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    public static ArrayList<ItemModel> itemModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        itemAdapter = new ItemAdapter(itemModel, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    private void getData() {
        itemModel = new ArrayList<>();
        itemModel.add(new ItemModel(1,"Acer Aspire 5 Spin 14",
                "Intel® Core™ i5-1335U, RAM 16 GB SSD 512 GB ",
                "Layar: 14.0\" FHD IPS \n Prosesor: Intel® Core™ i5-1335U \n Graphic Card: NVIDIA® GeForce® RTX 4060 with 8 GB of GDDR6 \n RAM: 16 GB of LPDDR5 Dual Channel \n Storage: SSD 512GB PCIe Gen4, NVMe \n Konektivitas: Killer Wi-Fi 6E, Bluetooth \n Port: 1x HDMI® port 2.1 with HDCP support, 1x USB Thunderbolt 4 (Type-C), 2x USB 3.2 Gen 1 (1x with power off charging features); 1x Audio jack \n Baterai: 50Wh Li-ion, Up to 14 hours",
                "Rp.12.125.000",
                R.drawable.acer_aspire5_spin14));
        itemModel.add(new ItemModel(2, "Acer Aspire 5 Slim",
                "Intel® Core™ i7-1355U, RAM 16 GB SSD 512 GB ",
                "Layar: 15.6\" Full HD (1920 x 1080) LED-backlit IPS ComfyView \n Prosesor: Intel® Core™ i7-1355U \n RAM: 16 GB LPDDR5 \n Storage: 512 GB SSD PCIe Gen4 NVMe \n Konektivitas: Wi-Fi 6E with MU-MIMO, Bluetooth 5.2 \n Port: USB 3.2 (Type-C) Gen 1 port (up to 5 Gbps) USB, 3.2 Gen 1 Ports (one with Power-off Charging) 1 - USB 2.0 Port 1 - HDMI 2.0 Port with HDCP support Memory Card Reader \n Baterai: 11 Jam",
                "Rp.15.299.000",
                R.drawable.acer_aspire_slim5));
        itemModel.add(new ItemModel(3, "Acer Swift Go 14 Oled",
                "Intel® Core™ i7-13700H, RAM 16 GB SSD 1 TB",
                "Layar: 14-0\" OLED, WQXGA+ (2880 x 1800) \n Prosesor: Intel® Core™ i7-13700H processor \n Graphic Card: NVIDIA® GeForce® RTX 4060 with 8 GB of GDDR6 \n RAM: 16 GB of LPDDR5 Dual Channel \n Storage: 1 TB SSD PCIe Gen4, NVMe \n Konektivitas: Killer Wireless Wi-Fi 6E 1675i \n Port: 2 x USB-C Thunderbolt 4 1 x HDMI 2.1 1x microSD card reader 1x USB Type-A \n Baterai: 50Wh, 4-cell, 53Wh",
                "Rp.18.499.000",
                R.drawable.acer_swift_go14));
        itemModel.add(new ItemModel(4, "Acer Nitro 16 an 16",
                "AMD Ryzen™ 5 7535HS, RAM 8 GB SSD 512 GB",
                "Layar: 16\" WUXGA (1920x1200) 165Hz, 400 nits, 100%sRGB, Anti-glare, G-Sync backlit TFT LCD \n Prosesor: AMD Ryzen™ 5 7535HS Processor (6 Cores, 12 Threads, Up to 4.55 GHz) \n Graphic Card: NVIDIA® GeForce® RTX4050 6GB (140W) GDDR6 \n RAM: 8GB DDR5 4800MHz RAM \n Storage: 512GB PCIe SSD (Gen 4) \n Konektivitas: Wi-Fi 6E & Bluetooth 5.1 \n Port: 2x USB 3.2 Gen 2 1x USB Standard-A port supporting USB 2.0 1x USB Type-C port supporting: • USB charging 5 V; 3 A • DC-in port 20 V; 65 W 1x USB Type-C port supporting: • USB 3.2 Gen 2 (up to 10 Gbps) • USB charging 5 V; 3 A • DC-in port 20 V; 65 W 1x HDMI® 2.1 port with HDCP support 1x microSD Card reader 1x 3.5 mm headphone/speaker jack, supporting headsets with built-in microphone 1x Ethernet (RJ-45) port 1x DC-in jack for AC adapter \n Baterai: 90Wh, 4-cell",
                "Rp.20.000.000",
                R.drawable.acer_nitro16));
        itemModel.add(new ItemModel(5, "Acer Predator Helios Neo 16",
                "Intel® Core™ i7-13700HX, RAM 2x8 GB SSD 1 TB",
                "Layar: 16\" WQXGA (2560 x 1600), IPS, 100 % sRGB, 165 Hz \n Prosesor: Intel® Core™ i7-13700HX \n Graphic Card: NVIDIA® GeForce® RTX 4060 with 8 GB of GDDR6 \n RAM: 2 x 8GB DDR5 (Dual Sub Channel) 4800 MHz, maksimal up to 32 GB \n Storage: 1 TB SSD NVMe Gen 4 \n Konektivitas: Intel Killer Wi-Fi6E & Bluetooth® 5.2 \n Port: 3 USB Type A - 2 USB Type C Thunderbolt - 1 HDMI Port - 1 LAN Port RJ45 (Intel Killer E2600) - 1 Audio Combo Jack \n Baterai: Integrated",
                "Rp.26.999.000",
                R.drawable.acer_predator));
        itemModel.add(new ItemModel(6, "Asus Vivobook 14X Oled",
                "AMD Ryzen™ 7 5800H, RAM 8 GB SSD 256 GB",
                "Layar: 13.3\" OLED WQXGA+ (2880 X 1800), VESA CERTIFIED Display HDR True Black 500, 550nits HDR \n Prosesor: AMD Ryzen™ 7 5800H Mobile Processor \n Graphic Card: AMD Radeon™ Vega 7 Graphics \n RAM: 8GB DDR4 on board \n Storage: 256GB M.2 NVMe™ PCIe® 3.0 SSD \n Konektivitas: Wi-Fi 6(802.11ax) (Dual band) 2*2 + Bluetooth® 5.3 Wireless Card \n Port: 1x USB 2.0 Type-A 1x USB 3.2 Gen 1 Type-C 2x USB 3.2 Gen 1 Type-A 1x HDMI 1.4 1x 3.5mm Combo Audio Jack 1x DC-in \n Baterai: 50WHrs, 3S1P, 3-cell Li-ion",
                "Rp.10.271.000",
                R.drawable.asus_vivobook_14xoled));
        itemModel.add(new ItemModel(7, "Asus Vivobook 13 Slate Oled T3304",
                "Intel® Core™ i3-N300, RAM 8 GB SSD 256 GB",
                "Layar: 13.3\" OLED WQXGA+ (2880 X 1800), VESA CERTIFIED Display HDR True Black 500, 550nits HDR \n Prosesor: Intel® Core™ i3-N300 Processor 0.8 GHz \n Graphic Card: Intel® UHD Graphics \n RAM: 8GB LPDDR5 on board \n Storage: 256 GB UFS 2.1 \n Konektivitas: Wi-Fi 6(802.11ax) (Dual band) 2*2 + Bluetooth® 5 \n Port: 2x USB 3.2 Gen 2 Type-C support display / power delivery 1x 3.5mm Combo Audio Jack Micro SD card reader \n Baterai: 50WHrs, 2S1P, 2-cell Li-ion",
                "Rp.11.599.000",
                R.drawable.asus_vivobook_13slate));
        itemModel.add(new ItemModel(8, "Asus Vivobook 15",
                "AMD Ryzen™ 7 7735HS, RAM 8 GB SSD 512 GB",
                "Layar: 13.3\" OLED WQXGA+ (2880 X 1800), VESA CERTIFIED Display HDR True Black 500, 550nits HDR \n Prosesor: AMD Ryzen™ 7 7735HS Mobile Processor \n Graphic Card: AMD Radeon™ RX 7600S \n RAM: 8GB DDR5-4800 SO-DIMM x 2, Max Capacity:32GB \n Storage: 512GB PCIe® 4.0 NVMe™ M.2 SSD \n Konektivitas: Wi-Fi 6(802.11ax) (Dual band) 2*2 + Bluetooth® 5.3 \n Port: 1x 3.5mm Combo Audio Jack 1x HDMI 2.1 FRL 2x USB 3.2 Gen 1 Type-A 1x USB 3.2 Gen 2 Type-C support DisplayPort™ / power delivery 1x RJ45 LAN port 1x Type C USB 4 support DisplayPort™ \n Baterai: 90WHrs, 4S1P, 4-cell Li-ion",
                "Rp.17.645.000",
                R.drawable.asus_vivobook15));
        itemModel.add(new ItemModel(9, "Asus Zenbook S 13 Oled UX5304",
                "Intel® Core™ i7-1355U, RAM 16 GB SSD 1 T",
                "Layar: 13.3\" OLED WQXGA+ (2880 X 1800), VESA CERTIFIED Display HDR True Black 500, 550nits HDR \n Prosesor: Intel® Core™ i7-1355U ,1.7 GHz (12MB Cache, up to 5.0 GHz, 10 cores, 12 Threads) \n Graphic Card: Intel Iris Xe Graphics \n RAM: 16 GB LPDDR5 \n Storage: 1TB M.2 NVMe PCIe 4.0 Performance SSD \n Konektivitas: Wi-Fi 6E + Bluetooth \n Port: 1x USB 3.2 (Gen 2) Type-A, 2x Thunderbolt 4 HDMI Port(s) : 1x HDMI \n Baterai: 63 Whr",
                "Rp.23.999.000",
                R.drawable.asus_zenbook_s13oled));
        itemModel.add(new ItemModel(10, "Asus Zenbook Pro 14 Duo Oled UX8402ZE",
                "Intel® Core™ i7-12700H, RAM 16 GB SSD 512 GB",
                "Layar: 13.3\" OLED WQXGA+ (2880 X 1800), VESA CERTIFIED Display HDR True Black 500, 550nits HDR \n Prosesor: Intel® Core™ i7-12700H Processor \n Graphic Card: Intel Iris Xᵉ Graphics / RTX 3050 Ti \n RAM: 16 GB LPDDR5 on board \n Storage: 512GB M.2 NVMe™ PCIe® 4.0 Performance SSD \n Konektivitas: Wi-Fi 6E(802.11ax) (Dual band) 2*2 + Bluetooth 5 \n Port: 1x USB 3.2 Gen 2 Type-A 2x Thunderbolt™ 4 supports display / power delivery 1x HDMI 2.1 1x 3.5mm Combo Audio Jack 1x DC-in Micro SD Express 7.1 card reader \n Baterai: 76WHrs, 4S1P, 4-cell Li-ion",
                "Rp.33.499.000",
                R.drawable.asus_zenbook_pro14));
        itemModel.add(new ItemModel(11, "Lenovo Ideapad Slim 5",
                "AMD Ryzen™ 5 7530U, RAM 16 GB SSD 512 GB",
                "Layar: 14\" WUXGA (1920x1200) IPS 300nits Anti-glare, 45% NTSC \n Prosesor: AMD Ryzen™ 5 7530U \n Graphic Card: Integrated AMD Radeon Graphics \n RAM: 16GB Soldered DDR4-3200 \n Storage: 512GB SSD M.2 2242 PCIe 4.0x4 NVMe \n Konektivitas: Wi-Fi 6E, 11ax 2x2 + BT5.1 \n Port: 1x USB 3.2 Gen 1 (Always On) 1x USB-C 3.2 Gen 2 (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x Thunderbolt 4 / USB4 40Gbps (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x HDMI, up to 4K/60Hz 1x Headphone / microphone combo jack (3.5mm) \n Baterai: Integrated 56.6Wh",
                "Rp.9.599.000",
                R.drawable.lenovo_ideapad_slim5));
        itemModel.add(new ItemModel(12, "Lenovo Yoga 6",
                "AMD Ryzen™ 5 7530U, RAM 16 GB SSD 512 GB",
                "Layar: 13.3\" WUXGA (1920x1200) IPS 300nits Glossy, 100% sRGB, Dolby Vision, TÜV Low Blue Light, Touch Touchscreen OGM, 10-point Multi-touch \n Prosesor: AMD Ryzen™ 5 7530U \n Graphic Card: Integrated AMD Radeon Graphics \n RAM: 16GB Soldered LPDDR4x-4266 \n Storage: 512GB SSD M.2 2242 PCIe 4.0x4 NVMe \n Konektivitas: Wi-Fi 6, 11ax 2x2 + BT5.1 \n Port: 1x USB 3.2 Gen 1 (Always On) 1x USB-C 3.2 Gen 2 (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x Thunderbolt 4 / USB4 40Gbps (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x HDMI, up to 4K/60Hz 1x Headphone / microphone combo jack (3.5mm) \n Baterai: Integrated 59Wh",
                "Rp.12.499.000",
                R.drawable.lenovo_yoga6));
        itemModel.add(new ItemModel(13, "Lenovo LOQ 15",
                "AMD Ryzen™ 5 7640HS, RAM 8 GB SSD 512 GB",
                "Layar: Panel WQHD 15,6 inci, resolusi 2.560 x 1.440 piksel, IPS 100 persen sRGB, refresh rate hingga 165 Hz, Anti-Glare, Nvidia G-SYNC \n Prosesor: AMD Ryzen™ 5 7640HS \n Graphic Card: Nvidia GeForce RTX 4050 95W TGP \n RAM: RAM 8 GB DDR5 5200 \n Storage: SSD 512 GB PCIe 4.0 \n Konektivitas: Bluetooth 5.1 + Wi-Fi 6 \n Port: 1x USB 3.2 Gen 1 atau 1 USB 2.0, 2x USB 3.2 Gen 2, 1x USB-C 3.2 Gen 2, 1x HDMI, 1x Ethernet (RJ-45), 1x headphone atau microphone combo jack 3,5 mm, 1x konektor power \n Baterai: 60 Whr",
                "Rp.15.179.000",
                R.drawable.lenovo_loq15));
        itemModel.add(new ItemModel(14, "Lenovo Legion Slim 5",
                "Intel® Core™ i7-13700H, RAM 2x8 GB SSD 512 GB ",
                "Layar: IPS 16\" WQXGA (2560x1600) \n Prosesor: Intel® Core™ i7-13700H \n Graphic Card: NVIDIA GeForce RTX 4050 \n RAM:2x 8GB SO-DIMM DDR5-5200 \n Storage: 512GB SSD M.2 2280 PCIe 4.0x4 NVMe \n Konektivitas: Wi-Fi 6E, 11ax 2x2 + BT5.1 \n Port: 1x USB 3.2 Gen 1 (Always On) 1x USB-C 3.2 Gen 2 (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x Thunderbolt 4 / USB4 40Gbps (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x HDMI, up to 4K/60Hz 1x Headphone / microphone combo jack (3.5mm) \n Baterai: Integrated 80Wh",
                "Rp.25.999.000",
                R.drawable.lenovo_legion_slim5));
        itemModel.add(new ItemModel(15, "Lenovo Yoga Book 9i",
                "Intel® Core™ i7-1355U, RAM 16 GB SSD 1 TB",
                "Layar: 2x 13.3-inch, 2880 x 1800, OLED, 16:10 touchscreens \n Prosesor: Intel® Core™ i7-1355U \n Graphic Card: Integrated Intel Iris Xe Graphics \n RAM: 16GB Soldered LPDDR5x-6400 \n Storage: 1TB SSD M.2 2242 PCIe 4.0x4 NVMe \n Konektivitas: WLAN + Bluetooth Wi-Fi 6E, 11ax 2x2 + BT5.1 \n Port: 1x USB 3.2 Gen 1 (Always On) 1x USB-C 3.2 Gen 2 (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x Thunderbolt 4 / USB4 40Gbps (support data transfer, Power Delivery 3.0 and DisplayPort 1.4) 1x HDMI, up to 4K/60Hz 1x Headphone / microphone combo jack (3.5mm) \n Baterai: Integrated 80Wh",
                "Rp.34.999.000",
                R.drawable.lenovo_yoga_book9i));
    }

}