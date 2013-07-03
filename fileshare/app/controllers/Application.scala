package controllers

import play.api._
import play.api.mvc._
import java.io.File

object Application extends Controller {

  val ShareRoot = "/Users/twer/Downloads/Scala"
  def file(path:String="") = Action {
    val file = new File(s"$ShareRoot/$path")
    if(file.isDirectory){
      file.getParentFile
      Ok(views.html.index(file,ShareRoot.length+1))
    } else {
      Ok.sendFile(file)
    }

  }
  
}