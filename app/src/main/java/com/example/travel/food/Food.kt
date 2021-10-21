package com.example.travel.food

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.MainActivity
import com.example.travel.R
import com.example.travel.Tourist.Tourist

class Food : AppCompatActivity() {


    private var recyclerView: RecyclerView? = null
    private var adapter: FoodAdapter? = null
    private var foodList: MutableList<food_dataset>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        var intent: Intent

        val backspace: ImageView = findViewById(R.id.backSpace)
        backspace.setOnClickListener { finish() }

        recyclerView = findViewById(R.id.recycler_view_food)
        adapter = FoodAdapter(this, foodList)
        recyclerView?.layoutManager = GridLayoutManager(this, 2)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        prepareAlbums()

    }
    private fun prepareAlbums() {
        val covers = intArrayOf(
            R.drawable.oneand,
            R.drawable.yendon,
            R.drawable.seob,
            R.drawable.bomnal,
            R.drawable.mihyang,
            R.drawable.jegal,
            R.drawable.yendon)
        var a = food_dataset(covers[0],"원 앤 온리", "4","제주의 산방산을 바로 뒤에 두고 이국적인 느낌을 뽐내는 카페입니다. " +
                "바다가 보이는 실내와 바다 바람까지 느낄 수 있는 야외 테이블이 준비되어 있습니다. 파라솔이 준비 된 테이블에서 야자수 나무와 같이 하루를 즐겨보시기를 추천드립니다."
            ,"제주특별자치도 서귀포시 안덕면 산방로 141","제주 원앤온리")
        foodList!!.add(a)
        a = food_dataset(covers[1],"연돈", "5","백종원의 골목식당을 계기로 전국 유명세를 얻게 된 연돈. 돈가스 전문 요리점으로 맛과 서비스 모두를 만족시켜주는 제주 필수 코스로 손꼽히고 있습니다." +
                "연돈을 예매를 위해 모두 8시를 기다리고 있을 정도로 후회없는 식사를 보장합니다.","제주특별자치도 서귀포시 색달동 일주서로 968-10","맛있는 여행")
        foodList!!.add(a)
        a = food_dataset(covers[2],"섭지코지로", "4.5","제주 성산 딱새우회를 찾는 분들은 항상 거쳐간다는 섭지코지로 입니다. 성산일출봉을 앞에다 두고 제주 딱새우회를 즐길 수 있는 새우, 고등어 전문점입니다." +
                "현지인들의 추천으로만 알려진 현지 맛집입니다.","제주특별자치도 서귀포시 성산읍 섭지코지로 43","망고 플레이트")
        foodList!!.add(a)
        a = food_dataset(covers[3],"봄날", "5","오션뷰를 가진 카페들이 모여있는 애월의 한담동 중 가장 인기 많은 애월카페입니다. 한담해변을 보며 풍류를 즐길 수도 있고," +
                "근처에서 가벼운 카약을 타며 놀 수도 있습니다. 손을 뻗으면 바닷물을 만질 수 있는 거리에서 파도 소리를 들으며 힐링을 하세요!","제주특별자치도 제주시 애월읍 애월리 2540","바다여행")
        foodList!!.add(a)
        a = food_dataset(covers[4],"제주 미향", "5","서귀포 중문에서 통갈치구이를 즐길 수 있는 제주 미향! 현지인들 식당으로도 유명하며 회, 조림, 전골, 구이를 모두 제공하고 있습니다." +
                "8첩 반상은 기본이며 따로 포장해갈 정도로 인기가 많은 집입니다.","제주특별자치도 서귀포시 색달동 천제연로 99","망고 플레이트")
        foodList!!.add(a)
        a = food_dataset(covers[5],"제갈양", "4","제주도 가시가 없는 갈치구이 제(주) 갈(치) 양(많이)입니다. 제주도의 대표 메뉴 중 하나인 갈치를 좋은 가격에 즐길 수 있습니다." +
                "근처만 와도 맡게되는 갈치의 향기 기다리지 말고 바로오세요!","제주시 KR특별자치도 제주시 한림 한림읍 한림로 155","맛집 여행")
        foodList!!.add(a)
        a = food_dataset(covers[1],"연돈", "5","백종원의 골목식당을 계기로 전국 유명세를 얻게 된 연돈. 돈가스 전문 요리점으로 맛과 서비스 모두를 만족시켜주는 제주 필수 코스로 손꼽히고 있습니다." +
                "연돈을 예매를 위해 모두 8시를 기다리고 있을 정도로 후회없는 식사를 보장합니다.","제주특별자치도 서귀포시 색달동 일주서로 968-10","맛있는 여행")
        foodList!!.add(a)
        a = food_dataset(covers[3],"봄날", "5","오션뷰를 가진 카페들이 모여있는 애월의 한담동 중 가장 인기 많은 애월카페입니다. 한담해변을 보며 풍류를 즐길 수도 있고," +
                "근처에서 가벼운 카약을 타며 놀 수도 있습니다. 손을 뻗으면 바닷물을 만질 수 있는 거리에서 파도 소리를 들으며 힐링을 하세요!","제주특별자치도 제주시 애월읍 애월리 2540","바다여행")
        foodList!!.add(a)
        a = food_dataset(covers[5],"제갈양", "4","제주도 가시가 없는 갈치구이 제(주) 갈(치) 양(많이)입니다. 제주도의 대표 메뉴 중 하나인 갈치를 좋은 가격에 즐길 수 있습니다." +
                "근처만 와도 맡게되는 갈치의 향기 기다리지 말고 바로오세요!","제주시 KR특별자치도 제주시 한림 한림읍 한림로 155","맛집 여행")
        foodList!!.add(a)
        a = food_dataset(covers[0],"원 앤 온리", "4","제주의 산방산을 바로 뒤에 두고 이국적인 느낌을 뽐내는 카페입니다. " +
                "바다가 보이는 실내와 바다 바람까지 느낄 수 있는 야외 테이블이 준비되어 있습니다. 파라솔이 준비 된 테이블에서 야자수 나무와 같이 하루를 즐겨보시기를 추천드립니다."
            ,"제주특별자치도 서귀포시 안덕면 산방로 141","제주 원앤온리")
        foodList!!.add(a)
        a = food_dataset(covers[2],"섭지코지로", "4.5","제주 성산 딱새우회를 찾는 분들은 항상 거쳐간다는 섭지코지로 입니다. 성산일출봉을 앞에다 두고 제주 딱새우회를 즐길 수 있는 새우, 고등어 전문점입니다." +
                "현지인들의 추천으로만 알려진 현지 맛집입니다.","제주특별자치도 서귀포시 성산읍 섭지코지로 43","망고 플레이트")
        foodList!!.add(a)

        adapter!!.notifyDataSetChanged()
    }
}