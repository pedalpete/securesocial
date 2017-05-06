
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
object passwordResetEmail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[securesocial.core.Identity,String,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity, token: String)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.84*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Hello """),_display_(Seq[Any](/*5.11*/user/*5.15*/.firstName)),format.raw/*5.25*/(""",</p>

<p>Please follow this
    <a href=""""),_display_(Seq[Any](/*8.15*/securesocial/*8.27*/.core.providers.utils.RoutesHelper.resetPassword(token).absoluteURL(IdentityProvider.sslEnabled))),format.raw/*8.123*/("""">
    link</a> to reset your password.
</p>
</body>
</html>"""))}
    }
    
    def render(user:securesocial.core.Identity,token:String,request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(user,token)(request)
    
    def f:((securesocial.core.Identity,String) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (user,token) => (request) => apply(user,token)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/passwordResetEmail.scala.html
                    HASH: 657523434a9b87594a2c9948b81a0ca464ef85f2
                    MATRIX: 629->1|847->83|874->127|933->151|945->155|976->165|1054->208|1074->220|1192->316
                    LINES: 19->1|23->1|24->3|26->5|26->5|26->5|29->8|29->8|29->8
                    -- GENERATED --
                */
            