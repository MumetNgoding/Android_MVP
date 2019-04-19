package founder.nugroho.android_mvp.AllResult

import founder.nugroho.android_mvp.INTERFACES.Presenter

class PresenterResult : Presenter<ViewResult> {

    var mViewResult : ViewResult? = null

    override fun onAttach(views: ViewResult) {
        mViewResult = views
    }

    override fun onDetach() {
        mViewResult = null
    }

    fun showResult(text : String) {
        mViewResult?.onShowResult(text)
    }
}