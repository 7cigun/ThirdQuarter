package com.example.thirdquarter

class CountersPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun onCounterClick(id: Int){
        when (id) {
            BUTTON_ONE -> {
                view.setText(model.next(0).toString(), 0)
            }
            BUTTON_TWO -> {
                view.setText(model.next(1).toString(), 1)
            }
            BUTTON_THREE -> {
                view.setText(model.next(2).toString(), 2)
            }
        }
    }
}