package founder.nugroho.android_mvp.MAIN

import founder.nugroho.android_mvp.INTERFACES.Presenter
import founder.nugroho.android_mvp.MODEL.Data

class MainPresenter : Presenter<MainView> {
    private var mView : MainView? = null

    override fun onAttach(views: MainView) {
        mView = views
    }

    override fun onDetach() {
        mView = null
    }

    fun showFragment(){
        val data = Data()
        data.text = "Hello From Data"

        mView?.onShowFragment(data)
    }
}