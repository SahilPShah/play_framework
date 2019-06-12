
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Welcome")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

"""),format.raw/*7.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h1>HELLO WORLD</h1>
      <h2>Welcome to the Hello World Tutorial!</h2>
      <!--<p>This tutorial introduces Play Framework, describes how Play web applications work, and walks you through steps
        to create page that displays a Hello World greeting.</p>
      <p>If you loaded this page from the web server running on <code>localhost:9000</code>, congratulations! You have
        successfully built and run a Play application. If not, you likely opened the source <code>index.scala.html</code>
        file. Please follow the directions in the <code>README.md</code> file in the top-level project directory to run
        the tutorial.</p>-->

      <h3 id="introduction">Introduction to Play</h3>
      <p>As illustrated below, Play is a full-stack framework with all of the components you need to build a Web
        Application or a REST service, including:</p>
      <ul>
        <li>An integrated HTTP server</li>
        <li>Form handling</li>
        <li>Cross-Site Request Forgery (CSRF) protection</li>
        <li>A powerful routing mechanism</li>
        <li>I18n support, and more.</li>
      </ul>

      <img src="assets/images/play-stack.png" alt="Play Stack" class="small-5 medium-4 large-3" />

      <p>Play integrates with many object relational mapping (ORM) layers. It has out-of-the-box support for <a href="https://www.playframework.com/documentation/"""),_display_(/*32.164*/version),format.raw/*32.171*/("""/Anorm"
          target="_blank">Anorm</a>, <a href="https://www.playframework.com/documentation/"""),_display_(/*33.92*/version),format.raw/*33.99*/("""/JavaEbean" target="_blank">JavaEbean</a>,
        <a href="https://www.playframework.com/documentation/"""),_display_(/*34.63*/version),format.raw/*34.70*/("""/PlaySlick" target="_blank">PlaySlick</a>, and
        <a href="https://www.playframework.com/documentation/"""),_display_(/*35.63*/version),format.raw/*35.70*/("""/JavaJPA" target="_blank">JPA</a>. See <a href="https://www.playframework.com/documentation/"""),_display_(/*35.163*/version),format.raw/*35.170*/("""/JavaDatabase"
          target="_blank">Accessing an SQL Database</a> for more information. Many customers use NoSQL, other ORMs or
        even access data from a REST service.</p>


      <p>Play APIs are available in both Java and Scala. The Framework uses <a href="https://akka.io" target="_blank">Akka</a>
        and <a href="https://doc.akka.io/docs/akka-http/current/index.html" target="_blank">Akka HTTP</a> under the
        hood. This endows Play applications with a stateless, non-blocking, event-driven architecture that provides
        horizontal and vertical scalability and uses resources more efficiently. Play projects contain Scala
        components, but because Play has a Java API, Java developers do not need to learn Scala to use Play
        successfully.</p>

      <p>Here are just a few of the reasons developers love using Play Framework:</p>
      <ul>
        <li>Its Model-View-Controller (MVC) architecture is familiar and easy to learn.</li>
        <li>Direct support of common web development tasks and hot reloading saves precious development time.</li>
        <li>A large active community promotes knowledge sharing.</li>
        <li>Use of <a href="https://github.com/playframework/twirl">Twirl templates</a> to render pages. The Twirl
          template language is:
          <ol>
            <li>Easy to learn</li>
            <li>Requires no special editor</li>
            <li>Provides type safety</li>
            <li>Is compiled so that errors display in the browser</li>
          </ol>
        </li>
      </ul>

      <p>To learn more about Play's benefits, visit the <a href="https://www.playframework.com" target="_blank">Play
          website</a>.</p>

      <h3 id="next-steps">Next steps</h3>
      <p>Now, let's <a href=""""),_display_(/*67.31*/routes/*67.37*/.HomeController.explore),format.raw/*67.60*/("""">explore the tutorial Play application</a>.</p>
    </article>
    <aside>
      """),_display_(/*70.8*/commonSidebar()),format.raw/*70.23*/("""
    """),format.raw/*71.5*/("""</aside>
  </div>
</section>
""")))}),format.raw/*74.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jun 12 15:08:35 CDT 2019
                  SOURCE: C:/Users/sahil.shah/Desktop/play_framework/play_framework/app/views/index.scala.html
                  HASH: cbe784e566b3b77e1ab87fd135bbc1b35fb433a8
                  MATRIX: 941->1|1037->4|1065->7|1088->22|1127->24|1154->26|1201->65|1251->78|1279->80|2762->1535|2791->1542|2917->1641|2945->1648|3077->1753|3105->1760|3241->1869|3269->1876|3390->1969|3419->1976|5227->3757|5242->3763|5286->3786|5395->3869|5431->3884|5463->3889|5523->3919
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|38->7|63->32|63->32|64->33|64->33|65->34|65->34|66->35|66->35|66->35|66->35|98->67|98->67|98->67|101->70|101->70|102->71|105->74
                  -- GENERATED --
              */
          