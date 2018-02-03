package it.turingtest.spotify.scala.client.entities

import play.api.libs.json.{JsPath, Reads}
import play.api.libs.functional.syntax._

case class NewReleases(albums: Page[SimpleAlbum], message: Option[String])

object NewReleases {

  implicit val newReleasesReads: Reads[NewReleases] = (
    (JsPath \ "albums").lazyRead[Page[SimpleAlbum]](Page.reads[SimpleAlbum]) and
      (JsPath \ "message").readNullable[String]
    ) (NewReleases.apply _)

}

