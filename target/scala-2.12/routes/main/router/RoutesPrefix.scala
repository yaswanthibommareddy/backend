// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yaswanthi/Documents/backend/conf/routes
// @DATE:Thu Feb 14 11:27:02 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
