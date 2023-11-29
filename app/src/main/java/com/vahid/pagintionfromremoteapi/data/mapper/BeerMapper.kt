package com.vahid.pagintionfromremoteapi.data.mapper

import com.vahid.pagintionfromremoteapi.data.local.BeerEntity
import com.vahid.pagintionfromremoteapi.data.remote.BeerDto
import com.vahid.pagintionfromremoteapi.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}