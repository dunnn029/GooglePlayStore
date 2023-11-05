package com.example.googleplaystore.category

import com.example.googleplaystore.app.FakeAppSource

class FakeCategorySource {
    fun getCategory(): ArrayList<Category> {
        val data = ArrayList<Category>()

        data.add(
            Category(
            "Đề xuất cho bạn",
            FakeAppSource().getRecommendedApp()
        )
        )

        data.add(
            Category(
            "Ứng dụng phổ biến",
            FakeAppSource().getPopularApp()
        )
        )

        data.add(
            Category(
            "Trò chơi phổ biến",
            FakeAppSource().getGameApp()
        )
        )

        data.add(
            Category(
            "Dựa trên hoạt động gần đây của bạn",
            FakeAppSource().getRecentApp()
        )
        )

        data.add(
            Category(
            "Ứng dụng phổ biến",
            FakeAppSource().getPopularApp()
        )
        )

        data.add(
            Category(
            "Đề xuất cho bạn",
            FakeAppSource().getRecommendedApp()
        )
        )

        data.add(
            Category(
            "Dựa trên hoạt động gần đây của bạn",
            FakeAppSource().getRecentApp()
        )
        )

        data.add(
            Category(
            "Trò chơi phổ biến",
            FakeAppSource().getGameApp()
        )
        )

        return data
    }
}