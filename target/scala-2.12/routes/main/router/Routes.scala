// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yaswanthi/Documents/casettaBackEnd/conf/routes
// @DATE:Thu Feb 14 10:32:58 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  UsersController_2: controllers.UsersController,
  // @LINE:12
  HotelController_0: controllers.HotelController,
  // @LINE:19
  HomeController_3: controllers.HomeController,
  // @LINE:21
  CountController_1: controllers.CountController,
  // @LINE:23
  AsyncController_4: controllers.AsyncController,
  // @LINE:26
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    UsersController_2: controllers.UsersController,
    // @LINE:12
    HotelController_0: controllers.HotelController,
    // @LINE:19
    HomeController_3: controllers.HomeController,
    // @LINE:21
    CountController_1: controllers.CountController,
    // @LINE:23
    AsyncController_4: controllers.AsyncController,
    // @LINE:26
    Assets_5: controllers.Assets
  ) = this(errorHandler, UsersController_2, HotelController_0, HomeController_3, CountController_1, AsyncController_4, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UsersController_2, HotelController_0, HomeController_3, CountController_1, AsyncController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UsersController.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UsersController.getCurrentUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UsersController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UsersController.signOutUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels""", """controllers.HotelController.createHotel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels/""" + "$" + """id<[^/]+>""", """controllers.HotelController.getHotelById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels/""" + "$" + """id<[^/]+>""", """controllers.HotelController.updateHotelById(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels/""" + "$" + """id<[^/]+>""", """controllers.HotelController.deleteHotelById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hotels""", """controllers.HotelController.getAllHotels()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_UsersController_registerUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UsersController_registerUser0_invoker = createInvoker(
    UsersController_2.registerUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "registerUser",
      Nil,
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UsersController_getCurrentUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/me")))
  )
  private[this] lazy val controllers_UsersController_getCurrentUser1_invoker = createInvoker(
    UsersController_2.getCurrentUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "getCurrentUser",
      Nil,
      "GET",
      this.prefix + """users/me""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UsersController_signInUser2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signin")))
  )
  private[this] lazy val controllers_UsersController_signInUser2_invoker = createInvoker(
    UsersController_2.signInUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "signInUser",
      Nil,
      "PUT",
      this.prefix + """users/signin""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UsersController_signOutUser3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/signout")))
  )
  private[this] lazy val controllers_UsersController_signOutUser3_invoker = createInvoker(
    UsersController_2.signOutUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsersController",
      "signOutUser",
      Nil,
      "PUT",
      this.prefix + """users/signout""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HotelController_createHotel4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels")))
  )
  private[this] lazy val controllers_HotelController_createHotel4_invoker = createInvoker(
    HotelController_0.createHotel(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "createHotel",
      Nil,
      "POST",
      this.prefix + """hotels""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HotelController_getHotelById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_getHotelById5_invoker = createInvoker(
    HotelController_0.getHotelById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "getHotelById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """hotels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HotelController_updateHotelById6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_updateHotelById6_invoker = createInvoker(
    HotelController_0.updateHotelById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "updateHotelById",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """hotels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HotelController_deleteHotelById7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_deleteHotelById7_invoker = createInvoker(
    HotelController_0.deleteHotelById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "deleteHotelById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """hotels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HotelController_getAllHotels8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels")))
  )
  private[this] lazy val controllers_HotelController_getAllHotels8_invoker = createInvoker(
    HotelController_0.getAllHotels(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HotelController",
      "getAllHotels",
      Nil,
      "GET",
      this.prefix + """hotels""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index9_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CountController_count10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count10_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AsyncController_message11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message11_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_UsersController_registerUser0_route(params@_) =>
      call { 
        controllers_UsersController_registerUser0_invoker.call(UsersController_2.registerUser())
      }
  
    // @LINE:6
    case controllers_UsersController_getCurrentUser1_route(params@_) =>
      call { 
        controllers_UsersController_getCurrentUser1_invoker.call(UsersController_2.getCurrentUser())
      }
  
    // @LINE:7
    case controllers_UsersController_signInUser2_route(params@_) =>
      call { 
        controllers_UsersController_signInUser2_invoker.call(UsersController_2.signInUser())
      }
  
    // @LINE:8
    case controllers_UsersController_signOutUser3_route(params@_) =>
      call { 
        controllers_UsersController_signOutUser3_invoker.call(UsersController_2.signOutUser())
      }
  
    // @LINE:12
    case controllers_HotelController_createHotel4_route(params@_) =>
      call { 
        controllers_HotelController_createHotel4_invoker.call(HotelController_0.createHotel())
      }
  
    // @LINE:13
    case controllers_HotelController_getHotelById5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_getHotelById5_invoker.call(HotelController_0.getHotelById(id))
      }
  
    // @LINE:14
    case controllers_HotelController_updateHotelById6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_updateHotelById6_invoker.call(HotelController_0.updateHotelById(id))
      }
  
    // @LINE:15
    case controllers_HotelController_deleteHotelById7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_deleteHotelById7_invoker.call(HotelController_0.deleteHotelById(id))
      }
  
    // @LINE:16
    case controllers_HotelController_getAllHotels8_route(params@_) =>
      call { 
        controllers_HotelController_getAllHotels8_invoker.call(HotelController_0.getAllHotels())
      }
  
    // @LINE:19
    case controllers_HomeController_index9_route(params@_) =>
      call { 
        controllers_HomeController_index9_invoker.call(HomeController_3.index)
      }
  
    // @LINE:21
    case controllers_CountController_count10_route(params@_) =>
      call { 
        controllers_CountController_count10_invoker.call(CountController_1.count)
      }
  
    // @LINE:23
    case controllers_AsyncController_message11_route(params@_) =>
      call { 
        controllers_AsyncController_message11_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:26
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
