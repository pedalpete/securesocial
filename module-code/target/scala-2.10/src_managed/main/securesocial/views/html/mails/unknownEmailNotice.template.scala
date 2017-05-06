
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
object unknownEmailNotice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[RequestHeader,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(implicit request: RequestHeader):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""
<html>
<body>
<p>Hello,</p>

<p>We received a request to reset a password in our system.  The attempt has failed because we do not have
    a registered account with this email address. It could be that you logged in using an external account such as Twitter
    or Facebook.</p>

<p>
    If you never created an account with us ignore this email, otherwise if you think you have an account with us contact
    tech support for further assistance.
</p>
</body>
</html>"""))}
    }
    
    def render(request:RequestHeader): play.api.templates.HtmlFormat.Appendable = apply(request)
    
    def f:((RequestHeader) => play.api.templates.HtmlFormat.Appendable) = (request) => apply(request)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 29 05:38:25 AEDT 2017
                    SOURCE: /Users/fie070/old-server/securesocial/module-code/app/securesocial/views/mails/unknownEmailNotice.scala.html
                    HASH: c3a172e2918dce6e481cfe81035df857d44a88a3
                    MATRIX: 595->1|722->34
                    LINES: 19->1|22->1
                    -- GENERATED --
                */
            