
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
object alreadyRegisteredEmail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""
<html>
    <body>
        <p>Hello """),_display_(Seq[Any](/*6.19*/user/*6.23*/.firstName)),format.raw/*6.33*/(""",</p>

        <p>You tried to sign up but you already have an account with us.  If you don't remember your password please go
            <a href=""""),_display_(Seq[Any](/*9.23*/securesocial/*9.35*/.core.providers.utils.RoutesHelper.startResetPassword().absoluteURL(IdentityProvider.sslEnabled))),format.raw/*9.131*/("""">here</a> to reset it.</p>
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
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/alreadyRegisteredEmail.scala.html
                    HASH: fcb733bce236503ef8f12ba7ffb7486dea716a09
                    MATRIX: 626->1|829->68|856->112|928->149|940->153|971->163|1155->312|1175->324|1293->420
                    LINES: 19->1|23->1|24->3|27->6|27->6|27->6|30->9|30->9|30->9
                    -- GENERATED --
                */
            