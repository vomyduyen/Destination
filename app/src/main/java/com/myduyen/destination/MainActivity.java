package com.myduyen.destination;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv1;
    private List<RV> rvList = new ArrayList<RV>();
    private Adapter_RV RVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        rv1 = (RecyclerView) findViewById(R.id.rv1);

        // BaseAdapter adapter = new Adapter_RV_Music(this,list_rv);
        getData();
        rv1.setAdapter(RVAdapter);

        RVAdapter = new Adapter_RV(rvList, this);


//        Kieu listview muốn hiển thị ra.hình dọc hay ngang hay số cột

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rv1.setLayoutManager(layoutManager);
        rv1.setItemAnimator(new DefaultItemAnimator());
        rv1.setAdapter(RVAdapter);


    }

    //sự kiện click


    private void getData() {
        RV a = new RV(R.drawable.a, "Văn Miếu Quốc Tử Giám", "Đống Đa - Hà Nội", "Văn Miếu - Quốc Tử Giám là quần thể di tích đa dạng và phong phú hàng đầu của thành phố Hà Nội, nằm ở phía Nam kinh thành Thăng Long." +
                "Hiện nay, nơi đây đã được thủ tướng chính phủ Việt Nam đưa vào danh sách xếp hạng 23 di tích quốc gia đặc biệt." +
                "Quần thể kiến trúc Văn Miếu - Quốc Tử Giám bao gồm: hồ Văn, khu Văn Miếu - Quốc Tử Giám và vườn Giám và kiến trúc chủ thể là Văn Miếu - nơi thờ Khổng Tử và Quốc Tử Giám - trường đại học đầu tiên của Việt Nam.\n" +
                "Khu Văn Miếu - Quốc Tử Giám có tường gạch vồ bao quanh, phía trong chia thành 5 lớp không gian với các kiến trúc khác nhau. Mỗi lớp không gian đó được giới hạn bởi các tường gạch có 3 cửa để thông với nhau (gồm cửa chính giữa và hai cửa phụ hai bên)." +
                "Từ ngoài vào trong có các cổng lần lượt là: cổng Văn Miếu, Đại Trung, Đại Thành và cổng Thái Học. Với hơn 700 năm hoạt động đã đào tạo hàng nghìn nhân tài cho đất nước." +
                "Ngày nay, Văn Miếu Quốc Tử Giám là nơi tham quan của du khách trong và ngoài nước đồng thời cũng là nơi khen tặng cho học sinh xuất sắc và còn là nơi tổ chức hội thơ hàng năm vào ngày rằm tháng giêng." +
                "Đây từng là nơi các sĩ tử đến cầu may trước mỗi kỳ thi bằng cách vuốt đầu rùa tại các bia tiến sĩ, tuy nhiên, ngày nay, để bảo tồn di tích," +
                " một hàng rào được thiết lập và các sĩ tử không còn làm nghi thức cầu may như trước nữa.Nơi này là nơi trên tờ tiền polymer 100.000 VND của Việt Nam",21.029387, 105.836165);
        rvList.add(a);
        RV b = new RV(R.drawable.b, "Nhà Thờ Lớn", "40 - Nhà Chung - Hàng Trống - Quận Hoàn Kiếm - Hà Nội", "Nhà thờ Lớn Hà Nội (tên chính thức: Nhà thờ chính tòa Thánh Giuse) là nhà thờ chính tòa của Tổng giáo phận Hà Nội, nơi có ngai tòa của tổng Giám mục.\n" +
                "Đây cũng là một nhà thờ cổ tại thành phố này, thường xuyên diễn ra các sinh hoạt tín ngưỡng của các giáo dân thuộc tổng giáo phận Hà Nội.Nhà thờ được thiết kế theo phong cách kiến trúc Gothic trung cổ châu Âu, rất thịnh hành trong thế kỷ 12 và thời Phục Hưng ở châu Âu, làm theo mẫu của Nhà thờ Đức Bà Paris với những mái vòm uốn cong, rộng, hướng lên bầu trời.;\n " +
                "Vật liệu xây dựng chính của nhà thờ là gạch đất nung, tường trát bằng giấy bổi. Nhà thờ có chiều dài 64,5m, chiều rộng 20,5m và hai tháp chuông cao 31,5m với những trụ đá to nặng bốn góc. Trên đỉnh là cây thánh giá bằng đá.",21.028953,105.848900);
        rvList.add(b);
        RV c = new RV(R.drawable.c, "Hồ Hoàn Kiếm", "Quận Hoàn Kiếm - Hà Nội", "Hồ Hoàn Kiếm còn được gọi là Hồ Gươm (trong bản đồ Hà Nội năm 1886, hồ này được gọi là Hồ Hoàn Gươm - Lac de Hoan Guom), là một hồ nước ngọt tự nhiên nằm ở trung tâm thành phố Hà Nội. Hồ có diện tích khoảng 12 ha[2]." +
                " Trước kia, hồ còn có các tên gọi là hồ Lục Thủy (vì nước có màu xanh quanh năm), hồ Thủy Quân (dùng để duyệt thủy binh), hồ Tả Vọng và Hữu Vọng (trong thời Lê mạt). Tên gọi Hoàn Kiếm xuất hiện vào đầu thế kỷ 15 gắn với truyền thuyết vua Lê Lợi trả gươm báu cho Rùa thần.\n" +
                " Theo truyền thuyết, trong một lần vua Lê Lợi dạo chơi trên thuyền, bỗng một con rùa vàng nổi lên mặt nước đòi nhà vua trả thanh gươm mà Long Vương cho mượn để đánh đuổi quân Minh xâm lược. Nhà vua liền trả gươm cho rùa thần và rùa lặn xuống nước biến mất. Từ đó hồ được lấy tên là hồ Hoàn Kiếm." +
                " Tên hồ còn được lấy để đặt cho một quận trung tâm của Hà Nội (quận Hoàn Kiếm) và là hồ nước duy nhất của quận này cho đến ngày nay.",21.029069,105.852054);
        rvList.add(c);
        RV d = new RV(R.drawable.d, "Bảo Tàng Hà Nội", "5B - phố Hàm Long - quận Hoàn Kiếm - Hà Nội", "Bảo tàng Hà Nội, trước đây nằm ở số 5B phố Hàm Long, quận Hoàn Kiếm, Hà Nội, là nơi trưng bày giới thiệu về thủ đô Hà Nội từ khi dựng nước đến nay.\n" +
                "Được thành lập từ năm 1982, nên số lượng hiện vật của bảo tàng lên tới hàng chục ngàn, trong đó riêng kho cổ vật quý hiếm đã chiếm tới hơn 7 ngàn. Bộ sưu tập của bảo tàng bao gồm đồ đá, đồ đồng, gốm sứ các thời nhà Lý, Trần, Lê, Nguyễn, gốm sứ của Trung Quốc, Nhật Bản. Các khu vực trưng bày của bảo tàng được chia thành ba phần:\n" +
                "Lịch sử thiên nhiên Hà Nội;\n" +
                "Lịch sử Hà Nội từ khi dựng nước đến trước Cách mạng tháng Tám;\n" +
                "Lịch sử Hà Nội từ sau Cách mạng tháng Tám năm 1945 đến nay.",21.010224,105.786333);
        rvList.add(d);
//        RV e = new RV(R.drawable.e, "Đền Ngọc Sơn", "Quận Hoàn Kiếm - Hà Nội", "Cầu Thê Húc màu đỏ son, cong cong dẫn vào đền Ngọc Sơn ẩn sau những bóng đa cổ thụ. Đền được xây dựng vào thế kỉ 19 và là công trình điển hình về không gian và tạo tác kiến trúc.\n" +
//                " Với sự kết hợp hài hoà giữa đền và hồ, Đền Ngọc Sơn cùng với Hồ Hoàn Kiếm đã tạo nên một tổng thể kiến trúc Thiên – Nhân hợp nhất, mang lại một không gian chan hoà giữa thiên nhiên và con người."/*,21.030743,105.852343*/);
//        rvList.add(e);
//        RV f = new RV(R.drawable.f, "Nhà hát lớn Hà Nội", "01 Tràng Tiền - Phan Chu Trinh - Hoàn Kiếm - Hà Nội", "Toạ lạc giữa ngã tư phố Tràng Tiền và Ngô Quyền, Nhà hát Lớn Hà Nội được xây dựng vào những năm đầu của thế kỉ 20 và từ đó đến nay vẫn luôn là một công trình kiến trúc và văn hoá bậc nhất của thủ đô.;\n" +
//                " Được thiết kế theo phong cách cổ điển Pháp với nhiều đường nét và màu sắc giống với các nhà hát ở châu Âu, Nhà hát Lớn đã trở thành một trung tâm văn hoá diễn ra nhiều sự kiện và hoạt động biểu diễn nghệ thuật sân khấu lớn ở Việt Nam. Bạn hãy đến đây và đi dọc quanh khu sân trước cửa nhà hát để chiêm ngưỡng trọn vẹn mọi góc của toà kiến trúc to lớn này. "/*,21.024194,105.857857*/);
//        rvList.add(f);
//        RV g = new RV(R.drawable.g, "Hoàng thành Thăng Long - Cột cờ Hà Nội", "18 - Hoàng Diệu - Quán Thánh - Ba Đình - Hà Nội", "Nằm trên con đường Hoàng Diệu, Hoàng thành Thăng Long là một di sản văn hoá thế giới gắn liền với lịch sử của kinh thành Thăng Long – Hà Nội dưới thời các triều đại Lý, Trần, Lê và triều Nguyễn.;\n" +
//                " Đây là một công trình kiến trúc đồ sộ và mang nhiều giá trị lịch sử và khảo cổ học quan trọng. Trong những công trình cổ bên trong Hoàng Thành, nổi bật nhất là di tích Cột cờ Hà Nội (hay còn được gọi là Kỳ Đài Hà Nội) gắn liền với nhiều sự kiện lịch sử của dân tộc.\n" +
//                " Khi Cách mạng tháng Tám thành công, lần đầu tiên lá cờ đỏ sao vàng trên Cột cờ Hà Nội tung bay phấp phới giữa bầu trời thủ đô."/*,21.032572,105.839805*/);
//        rvList.add(g);
//        RV h = new RV(R.drawable.h, "Lăng Chủ tịch Hồ Chí Minh", "Độc Lập - Điện Biên - Ba Đình - Hà Nội", "Lăng Bác nằm ngay bên Quảng trường Ba Đình lịch sử, nơi Chủ tịch Hồ Chí Minh đọc bản Tuyên ngôn độc lập ra đời nước Cộng hoà xã hội chủ nghĩa Việt Nam.\n" +
//                " Nơi an nghỉ vĩnh hằng của vị lãnh tụ vĩ đại của dân tộc được bao phủ trong không gian cây vườn bốn mùa xanh tươi toả bóng mát. Bạn có thể tiện thuê cho mình một khách sạn gần Lăng Chủ Tịch để tiện cho những chuyến thăm quan, vui chơi của mình"/*,21.036796,105.834641*/);
//        rvList.add(h);
//        RV i = new RV(R.drawable.i, "Hồ Tây", "Đường Ven Hồ Tây - Tây Hồ - Hà Nội", "Hồ Tây là “lá phổi” của thủ đô với diện tích lòng hồ hơn 500ha và cung đường quanh hồ dài 17km. ;\n" +
//                "Hãy lấy xe máy đi dạo một vòng quanh hồ để ngắm nhìn khung cảnh lãng mạn bên mặt hồ trong xanh mênh mông phảng phất những con gió mát rượi, cũng như thăm quan một số các thắng cảnh gần hồ như làng hoa đào Nhật Tân, làng Nghi Tàm, đền Quán Thánh,…."/*,21.053281,105.826094*/);
//        rvList.add(i);
//        RV j = new RV(R.drawable.j, "Chùa Trấn Quốc", "46 - Thanh Niên - Yên Phụ - Tây Hồ - Hà Nội", "Nằm trên đường Thanh Niên, chùa Trấn Quốc là danh thắng bậc nhất kinh kỳ với kiến trúc cổ kính, uy nghiêm hoà hợp với cảnh quan thanh nhã, yên bình bên mênh mông hồ nước.\n" +
//                " Được xây dựng từ thế kỉ thứ 6 và là một trong những ngôi chùa lâu đời nhất Hà Nội, qua hơn ngàn năm tồn tại, chùa Trấn Quốc không chỉ giữ gìn những giá trị kiến trúc đặc sắc mà còn chứng kiến biết bao thăng trầm của lịch sử dân tộc.\n" +
//                "Với những giá trị ấy, đây là địa điểm không những thu hút những tín đồ Phật tử mà còn chào đón nhiều khách thăm quan đến ghé thăm và thưởng ngoạn cảnh đẹp.\n"/*,21.047971,105.836942*/);
//        rvList.add(j);
//        RV k = new RV(R.drawable.k, "Chùa Một Cột", "Ông Ích Khiêm - Ba Đình - Hà Nội", "Nằm trong Bảo tàng Hồ Chí Minh, Chùa Một Cột là một thắng cảnh Hà Nội có tiếng thu hút rất nhiều du khách khi đến với thủ đô.\n" +
//                "Chùa có kiến trúc vô cùng độc đáo với kết cấu hình vuông nằm trên trụ đá giữa một hồ sen xanh lá, tựa như một đoá hoa sen nổi lên giữa mặt hồ."/*,21.035877,105.833617*/);
//        rvList.add(k);
//        RV l = new RV(R.drawable.l, "Ô Quan Chưởng", "Hàng Chiếu - Đồng Xuân - Hoàn Kiếm - Hà Nội", "Là cửa ô duy nhất còn sót lại của thành Thăng Long xưa, Ô Quan Chưởng không chỉ mang vẻ đẹp kiến trúc mà còn in đậm dấu ấn hào hùng bi tráng của lịch sử.\n" +
//                "Được xây dựng từ năm 1817, ban đầu cửa ô có tên là ô Đông Hà gồm 2 tầng được xây theo kiểu vọng lâu – kiểu kiến trúc đặc trưng ở thời Nguyễn." +
//                "Tên gọi ô Quan Chưởng sau này được nhân dân đặt để tưởng nhớ sự hi sinh anh dũng của viên chưởng cơ và binh lính nhà Nguyễn trong cuộc chiến đấu chống thực dân Pháp khi chúng đánh thành Hà Nội."/*,21.037346,105.852126*/);
//        rvList.add(l);
//        RV m = new RV(R.drawable.m, "Cầu Long Biên", "Yên Phụ - Tây Hồ - Hà Nội", "Cầu Long Biên được xây dựng từ năm 1899 – 1902, là cây cầu thép đầu tiên bắc qua sông Hồng. Đây đã từng là cây cầu dài thứ hai thế giới, được mệnh danh là “tháp Eiffel nằm ngang của Hà Nội”.\n" +
//                "Cầu Long Biên gắn liền với hai cuộc kháng chiến trường kì của dân tộc, cũng như chứng kiến sự chuyển mình đi lên của đất nước sau khi thống nhất. Cây cầu giờ đây không chỉ là chứng tích của lịch sử mà còn là biểu tượng của sự trường tồn, vẻ đẹp và sự phát triển văn hóa trong sự phát triển tương lai của Hà Nội.;\n" +
//                "Đặt khách sạn gần cầu Long Biên để thuận tiện chiêm ngưỡng vẻ đẹp của cầu."/*,21.043866,105.859838*/);
//        rvList.add(m);
//        RV n = new RV(R.drawable.n, "Thành Cổ Loa", "Xã Cổ Loa - Đông Anh - Hà Nội", "Khu di tích Cổ Loa nằm trên địa phận xã Cổ Loa, huyện Đông Anh. Được xây dựng từ thế kỉ thứ 3 TCN, thành Cổ Loa là tòa thành cổ có quy mô và cấu trúc lớn nhất của nước ta.\n" +
//                "Đây là nơi gắn liền với sự tích nỏ thần của An Dương Vương cùng chuyện tình buồn của công chúa Mị Nương – Trọng Thủy. Mùng 6 tháng giêng hàng năm là thời điểm người dân Cổ Loa tổ chức lễ hội để tưởng nhớ tới vua An Dương Vương đã có công dựng nước."/*,21.112104,105.871888*/);
//        rvList.add(n);
//

    }
}
