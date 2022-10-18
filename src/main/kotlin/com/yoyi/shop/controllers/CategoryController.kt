package com.yoyi.shop.controllers

import com.yoyi.shop.services.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController("CategoryController")
class CategoryController(
  private val categoryService: CategoryService
) {
  @GetMapping("/categories")
  fun categories() = ResponseEntity<List<String>>(
    categoryService.categories(), HttpStatus.OK
  )
}
