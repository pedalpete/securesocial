
package securesocial.views.html.mails

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
object signUpEmail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(token: String)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Hello,</p>

<p>Please follow this
    <a href=""""),_display_(Seq[Any](/*8.15*/securesocial/*8.27*/.core.providers.utils.RoutesHelper.signUp(token).absoluteURL(IdentityProvider.sslEnabled))),format.raw/*8.116*/("""">link</a> to complete your registration.
</p>
</body>
</html>"""))}
    }
    
    def render(token:String,request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(token)(request)
    
    def f:((String) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (token) => (request) => apply(token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/signUpEmail.scala.html
                    HASH: f3e2856f303dcd147830757c284a6fe3c05f8967
                    MATRIX: 595->1|779->49|806->93|906->158|926->170|1037->259
                    LINES: 19->1|23->1|24->3|29->8|29->8|29->8
                    -- GENERATED --
                */
            