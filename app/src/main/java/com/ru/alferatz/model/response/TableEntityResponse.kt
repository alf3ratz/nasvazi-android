package com.ru.alferatz.model.response

import com.google.gson.annotations.SerializedName
import com.ru.alferatz.model.entity.TableEntity

data class TableEntityResponse(
    @SerializedName("tables")
    var tables: ArrayList<TableEntity> = ArrayList()
)
