package com.fatihbugur.spanishquizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Which one is the Spanish name of this?",
        R.drawable.apple,
            "la naranja",
            "la manzana",
            "la fresa",
            "la uva",
            2
        )

        questionList.add(que1)

        val que2 = Question(2, "Which one is the Spanish name of this?",
            R.drawable.book,
            "la pluma",
            "el papel",
            "el libro",
            "el borrador",
            3
        )

        questionList.add(que2)

        val que3 = Question(3, "Which one is the Spanish name of this?",
            R.drawable.bread,
            "el pan",
            "el pastel",
            "la cena",
            "la mesa",
            1
        )

        questionList.add(que3)

        val que4 = Question(4, "Which one is the Spanish name of this?",
            R.drawable.car,
            "el tren",
            "lel avion",
            "la bicicleta",
            "el coche",
            4
        )

        questionList.add(que4)

        val que5 = Question(5, "Which one is the Spanish name of this?",
            R.drawable.cat,
            "la tortuga",
            "la serpiente",
            "el gato",
            "el perro",
            3
        )

        questionList.add(que5)

        val que6 = Question(6, "Which one is the Spanish name of this?",
            R.drawable.blue_shirt,
            "la camiseta azul",
            "la camiseta verde",
            "la falda azul",
            "la falda verde",
            1
        )

        questionList.add(que6)

        val que7 = Question(7, "Which one is the Spanish name of this?",
            R.drawable.dog,
            "la arana",
            "el raton",
            "el perro",
            "la jirafa",
            3
        )

        questionList.add(que7)

        val que8 = Question(8, "Which one is the Spanish name of this?",
            R.drawable.sun,
            "la nube",
            "el sol",
            "el arcoiris",
            "el mar",
            2
        )

        questionList.add(que8)

        val que9 = Question(9, "Which one is the Spanish name of this?",
            R.drawable.tree,
            "el arbol",
            "el bosque",
            "el cielo",
            "la hoja",
            1
        )

        questionList.add(que9)

        val que10 = Question(10, "Which one is the Spanish name of this?",
            R.drawable.water,
            "la leche",
            "la cafe",
            "el te",
            "el agua",
            4
        )

        questionList.add(que10)


        return questionList
    }
}