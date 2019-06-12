// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/sahil.shah/Desktop/play_framework/play_framework/conf/routes
// @DATE:Wed Jun 12 16:22:16 CDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def connectFourReset(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/connect-four")
    }
  
    // @LINE:8
    def connectFour(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/connect-four")
    }
  
    // @LINE:7
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:17
    def connectFourUpdate(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/v1/connect-four")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
