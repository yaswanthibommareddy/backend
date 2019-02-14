// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yaswanthi/Documents/backend/conf/routes
// @DATE:Thu Feb 14 11:27:02 IST 2019

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
  // @LINE:10
  ImagesController_6: controllers.ImagesController,
  // @LINE:14
  HotelController_0: controllers.HotelController,
  // @LINE:21
  HomeController_3: controllers.HomeController,
  // @LINE:23
  CountController_1: controllers.CountController,
  // @LINE:25
  AsyncController_4: controllers.AsyncController,
  // @LINE:28
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    UsersController_2: controllers.UsersController,
    // @LINE:10
    ImagesController_6: controllers.ImagesController,
    // @LINE:14
    HotelController_0: controllers.HotelController,
    // @LINE:21
    HomeController_3: controllers.HomeController,
    // @LINE:23
    CountController_1: controllers.CountController,
    // @LINE:25
    AsyncController_4: controllers.AsyncController,
    // @LINE:28
    Assets_5: controllers.Assets
  ) = this(errorHandler, UsersController_2, ImagesController_6, HotelController_0, HomeController_3, CountController_1, AsyncController_4, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UsersController_2, ImagesController_6, HotelController_0, HomeController_3, CountController_1, AsyncController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UsersController.registerUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/me""", """controllers.UsersController.getCurrentUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signin""", """controllers.UsersController.signInUser()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/signout""", """controllers.UsersController.signOutUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImagesController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImagesController.deleteImage(id:String)"""),
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

  // @LINE:10
  private[this] lazy val controllers_ImagesController_uploadImage4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImagesController_uploadImage4_invoker = createInvoker(
    ImagesController_6.uploadImage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "uploadImage",
      Nil,
      "POST",
      this.prefix + """images""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ImagesController_downloadImage5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_downloadImage5_invoker = createInvoker(
    ImagesController_6.downloadImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ImagesController_deleteImage6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImagesController_deleteImage6_invoker = createInvoker(
    ImagesController_6.deleteImage(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImagesController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """images/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HotelController_createHotel7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels")))
  )
  private[this] lazy val controllers_HotelController_createHotel7_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_HotelController_getHotelById8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_getHotelById8_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_HotelController_updateHotelById9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_updateHotelById9_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_HotelController_deleteHotelById10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HotelController_deleteHotelById10_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_HotelController_getAllHotels11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hotels")))
  )
  private[this] lazy val controllers_HotelController_getAllHotels11_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index12_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_CountController_count13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count13_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_AsyncController_message14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message14_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
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
  
    // @LINE:10
    case controllers_ImagesController_uploadImage4_route(params@_) =>
      call { 
        controllers_ImagesController_uploadImage4_invoker.call(ImagesController_6.uploadImage())
      }
  
    // @LINE:11
    case controllers_ImagesController_downloadImage5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_downloadImage5_invoker.call(ImagesController_6.downloadImage(id))
      }
  
    // @LINE:12
    case controllers_ImagesController_deleteImage6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImagesController_deleteImage6_invoker.call(ImagesController_6.deleteImage(id))
      }
  
    // @LINE:14
    case controllers_HotelController_createHotel7_route(params@_) =>
      call { 
        controllers_HotelController_createHotel7_invoker.call(HotelController_0.createHotel())
      }
  
    // @LINE:15
    case controllers_HotelController_getHotelById8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_getHotelById8_invoker.call(HotelController_0.getHotelById(id))
      }
  
    // @LINE:16
    case controllers_HotelController_updateHotelById9_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_updateHotelById9_invoker.call(HotelController_0.updateHotelById(id))
      }
  
    // @LINE:17
    case controllers_HotelController_deleteHotelById10_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_HotelController_deleteHotelById10_invoker.call(HotelController_0.deleteHotelById(id))
      }
  
    // @LINE:18
    case controllers_HotelController_getAllHotels11_route(params@_) =>
      call { 
        controllers_HotelController_getAllHotels11_invoker.call(HotelController_0.getAllHotels())
      }
  
    // @LINE:21
    case controllers_HomeController_index12_route(params@_) =>
      call { 
        controllers_HomeController_index12_invoker.call(HomeController_3.index)
      }
  
    // @LINE:23
    case controllers_CountController_count13_route(params@_) =>
      call { 
        controllers_CountController_count13_invoker.call(CountController_1.count)
      }
  
    // @LINE:25
    case controllers_AsyncController_message14_route(params@_) =>
      call { 
        controllers_AsyncController_message14_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:28
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
