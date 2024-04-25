package br.senai.sp.jandira.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.R
import br.senai.sp.jandira.model.Categorias

class caterogiaRepository {
    @Composable
    fun listarCategorias(): List <Categorias> {

        val montain = Categorias(
            1,
            categoria = "Montain",
            imagem = painterResource(id = R.drawable.montain)
        )

        val snow = Categorias (
            2,
            categoria = "Snow",
            imagem = painterResource(id = R.drawable.snow)
        )
        
        val beach = Categorias (
            3,
            categoria = "Beach",
            imagem = painterResource(id = R.drawable.beach )
        )

        return listOf(
            montain, snow, beach
        )
    }
}
