package com.example.besmarter_allis_imagegame.core.network

//data class Resource<out T>
//    (val status: Status,
//     val data: T?,
//     val message: String?,
//     val code: Int?) {
//    companion object {
//        fun <T> success(data: T?, code: Int): Resource<T> {
//            return Resource(Status.SUCCESS, data, null, null)
//        }
//
//        fun <T> error(msg: String?, data: T?, code: Int?): Resource<T> {
//            return Resource(Status.ERROR, data, msg, code)
//        }
//
//        fun <T> loading(data: T?): com.example.besmarter_allis_imagegame.core.network.Resource<T> {
//            return Resource(Status.LOADING, data, null, null)
//        }
//    }
//}