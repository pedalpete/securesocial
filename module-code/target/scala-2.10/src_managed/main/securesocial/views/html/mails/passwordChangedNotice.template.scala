
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
object passwordChangedNotice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[securesocial.core.Identity,RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: securesocial.core.Identity)(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import securesocial.core.IdentityProvider


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.1*/("""
<html>
<body>
<p>Hello """),_display_(Seq[Any](/*6.11*/user/*6.15*/.firstName)),format.raw/*6.25*/(""",</p>

<p>Your password was updated.  Please log in using your new password by clicking
    <a href=""""),_display_(Seq[Any](/*9.15*/securesocial/*9.27*/.core.providers.utils.RoutesHelper.login.absoluteURL(IdentityProvider.sslEnabled))),format.raw/*9.108*/("""">here</a></p>
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
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/passwordChangedNotice.scala.html
                    HASH: 4d4b8ec87e55b8bcaf611ae229169ea24dadc08f
                    MATRIX: 625->1|828->68|855->112|915->137|927->141|958->151|1095->253|1115->265|1218->346
                    LINES: 19->1|23->1|24->3|27->6|27->6|27->6|30->9|30->9|30->9
                    -- GENERATED --
                */
            