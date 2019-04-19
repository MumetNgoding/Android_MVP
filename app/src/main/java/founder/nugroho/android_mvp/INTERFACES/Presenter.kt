package founder.nugroho.android_mvp.INTERFACES

interface Presenter<T: Views> {
    fun onAttach(views: T)
    fun onDetach()
}