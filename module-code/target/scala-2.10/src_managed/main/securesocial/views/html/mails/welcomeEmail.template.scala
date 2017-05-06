
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
object welcomeEmail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""<html>
<body>
<p>Welcome """),_display_(Seq[Any](/*5.13*/user/*5.17*/.firstName)),format.raw/*5.27*/(""",</p>

<p>
    Your new account is ready.
    Click <a href=""""),_display_(Seq[Any](/*9.21*/securesocial/*9.33*/.core.providers.utils.RoutesHelper.login.absoluteURL(IdentityProvider.sslEnabled))),format.raw/*9.114*/("""">here</a> to log in</p>
</body>
</html>"""))}
    }
    
    def render(user:securesocial.core.Identity,request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(user)(request)
    
    def f:((securesocial.core.Identity) => (RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (user) => (request) => apply(user)(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/welcomeEmail.scala.html
                    HASH: f2a753b141daa138d700281f848a75cdd055e8b4
                    MATRIX: 616->1|819->68|846->112|907->138|919->142|950->152|1047->214|1067->226|1170->307
                    LINES: 19->1|23->1|24->3|26->5|26->5|26->5|30->9|30->9|30->9
                    -- GENERATED --
                */
            