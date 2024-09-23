package com.example.bestof.modules.product.model

import android.net.Uri
import com.example.bestof.modules.categories.model.CategoriesItems
import com.example.bestof.modules.categories.model.electronicsList
data class ProductInfo(
    val name: String,
    val stars: Float,
    val price: Float,
    val reviews: String,
    val medalType: String,
    val description: String,
    val url: String,
    val image1: String,
    val image2: String,
    val image3: String,
    val image4: String,
    val image5: String
)

val Headphone = listOf(
    ProductInfo(
        name = "Sony WH-1000XM5", //todo aumentar o nome exibido
        stars = 4.4f,
        price = 348.00f, //ajustar esse preço todo, talvez ver como usar preço ao invés de float
        reviews = "14.996",
        medalType = "Gold",
        description = "O Sony WH-1000XM4 é um fone de ouvido com cancelamento de ruído excepcional, som rico e design leve e confortável. Ele oferece recursos como conexão multiponto, bateria de até 30 horas, auto-pausa e LDAC para áudio de alta qualidade. É um dos melhores em custo-benefício para quem busca qualidade e conforto.",
        url = "https://amzn.to/4d9VoQp",
        image1 = "https://m.media-amazon.com/images/I/51aXvjzcukL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/61Gdpfwb4VL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/71GMFf-4cwL._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/61xEIO8OaXL._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/71wfM0kcGiL._AC_SL1500_.jpg"
    ),
    ProductInfo(
        name = "EarFun Wave Pro",
        stars = 4.5f,
        price = 79.99f,
        reviews = "835",
        medalType = "Silver",
        description = "O Earfun Wave Pro é um fone over-ear acessível, com ótimo cancelamento de ruído e até 80 horas de bateria. Possui som ajustável via aplicativo e drivers de 40mm, oferecendo um áudio impressionante para seu preço. Seu design é confortável, com ajuste de tamanho e almofadas de espuma para um bom encaixe.",
        url = "https://amzn.to/4dt2jod",
        image1 = "https://m.media-amazon.com/images/I/71iBJ8MknGL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/71AiCyHPvNL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/71qjDB6YD2L._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/719nHvkx38L._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/61FR4KXxVRL._AC_SL1500_.jpg"
    ),
    ProductInfo(
        name = "Bowers & Wilkins Px8",
        stars = 4.1f,
        price = 529.99f,
        reviews = "685",
        medalType = "Bronze",
        description = "O Bowers & Wilkins PX8 é um fone de ouvido premium que combina design elegante com som hi-fi de alta qualidade. Feito com detalhes em alumínio e couro Nappa, ele oferece cancelamento ativo de ruído, proporcionando uma experiência auditiva imersiva. Ideal para quem busca estilo e performance sonora de alto nível.",
        url = "https://amzn.to/3XSy2KY",
        image1 = "https://m.media-amazon.com/images/I/71iBJ8MknGL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/71n2p2toUiL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/61wUyZed+TL._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/71QcYVPigAL._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/71qsOL44utL._AC_SL1500_.jpg"
    )
)

val Headphone2 = listOf(
    ProductInfo(
        name = "Sonyyy WH-1000XM5", //todo aumentar o nome exibido
        stars = 4.4f,
        price = 348.00f, //ajustar esse preço todo, talvez ver como usar preço ao invés de float
        reviews = "14.996",
        medalType = "Gold",
        description = "O Sony WH-1000XM4 é um fone de ouvido com cancelamento de ruído excepcional, som rico e design leve e confortável. Ele oferece recursos como conexão multiponto, bateria de até 30 horas, auto-pausa e LDAC para áudio de alta qualidade. É um dos melhores em custo-benefício para quem busca qualidade e conforto.",
        url = "https://amzn.to/4d9VoQp",
        image1 = "https://m.media-amazon.com/images/I/51aXvjzcukL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/61Gdpfwb4VL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/71GMFf-4cwL._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/61xEIO8OaXL._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/71wfM0kcGiL._AC_SL1500_.jpg"
    ),
    ProductInfo(
        name = "EarFunnn Wave Pro",
        stars = 4.5f,
        price = 79.99f,
        reviews = "835",
        medalType = "Silver",
        description = "O Earfun Wave Pro é um fone over-ear acessível, com ótimo cancelamento de ruído e até 80 horas de bateria. Possui som ajustável via aplicativo e drivers de 40mm, oferecendo um áudio impressionante para seu preço. Seu design é confortável, com ajuste de tamanho e almofadas de espuma para um bom encaixe.",
        url = "https://amzn.to/4dt2jod",
        image1 = "https://m.media-amazon.com/images/I/71iBJ8MknGL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/71AiCyHPvNL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/71qjDB6YD2L._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/719nHvkx38L._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/61FR4KXxVRL._AC_SL1500_.jpg"
    ),
    ProductInfo(
        name = "Bowersss & Wilkins Px8",
        stars = 4.1f,
        price = 529.99f,
        reviews = "685",
        medalType = "Bronze",
        description = "O Bowers & Wilkins PX8 é um fone de ouvido premium que combina design elegante com som hi-fi de alta qualidade. Feito com detalhes em alumínio e couro Nappa, ele oferece cancelamento ativo de ruído, proporcionando uma experiência auditiva imersiva. Ideal para quem busca estilo e performance sonora de alto nível.",
        url = "https://amzn.to/3XSy2KY",
        image1 = "https://m.media-amazon.com/images/I/71iBJ8MknGL._AC_SL1500_.jpg",
        image2 = "https://m.media-amazon.com/images/I/71n2p2toUiL._AC_SL1500_.jpg",
        image3 = "https://m.media-amazon.com/images/I/61wUyZed+TL._AC_SL1500_.jpg",
        image4 = "https://m.media-amazon.com/images/I/71QcYVPigAL._AC_SL1500_.jpg",
        image5 = "https://m.media-amazon.com/images/I/71qsOL44utL._AC_SL1500_.jpg"
    ),
)