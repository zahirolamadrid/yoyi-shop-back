package com.yoyi.shop.services

import org.springframework.stereotype.Service

@Service
class CategoryService {
  fun categories(): List<String> {
    return listOf("hola")
  }
}
