
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object test extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
*single String arguement
*/
  def apply/*5.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.18*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang="'en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Test Web Page</title>
</head>
<body>
<h1>The Home Page</h1>
<h2>"""),_display_(/*17.6*/message),format.raw/*17.13*/("""</h2>
</body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jun 12 15:41:27 CDT 2019
                  SOURCE: C:/Users/sahil.shah/Desktop/play_framework/play_framework/app/views/test.scala.html
                  HASH: dd6b94cdd4e3dc9934b06a59fec4c8f892476e5f
                  MATRIX: 975->37|1086->53|1116->57|1429->344|1457->351
                  LINES: 30->5|35->5|37->7|47->17|47->17
                  -- GENERATED --
              */
          