package br.senai.sp.jandira.model

import androidx.compose.ui.graphics.painter.Painter

data class Categorias (
    var id: Int = 0,
    var categoria: String = "",
    var imagem: Painter? = null
)