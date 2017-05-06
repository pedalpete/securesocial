
package securesocial.views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object notAuthorized extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Messages("securesocial.notAuthorized.title"))/*1.52*/ {_display_(Seq[Any](format.raw/*1.54*/("""
    <div class="page-header">
        <h1>"""),_display_(Seq[Any](/*3.14*/Messages("securesocial.notAuthorized.title"))),format.raw/*3.58*/("""</h1>
    </div>

    <div class="alert alert-error">
        """),_display_(Seq[Any](/*7.10*/Messages("securesocial.notAuthorized.message"))),format.raw/*7.56*/("""
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/notAuthorized.scala.html
                    HASH: 8970711facb7013ec5c1fd026e76e37df3f0c422
                    MATRIX: 667->1|725->51|764->53|843->97|908->141|1006->204|1073->250
                    LINES: 22->1|22->1|22->1|24->3|24->3|28->7|28->7
                    -- GENERATED --
                */
            