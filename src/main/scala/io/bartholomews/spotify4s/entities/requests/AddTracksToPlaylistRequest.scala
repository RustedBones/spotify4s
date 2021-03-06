package io.bartholomews.spotify4s.entities.requests

import io.bartholomews.spotify4s.entities.dropNullValues
import io.circe.Encoder
import io.circe.generic.extras.semiauto.deriveConfiguredEncoder

case class AddTracksToPlaylistRequest(uris: List[String], position: Option[Int])
object AddTracksToPlaylistRequest {
  implicit val encoder: Encoder[AddTracksToPlaylistRequest] =
    dropNullValues(deriveConfiguredEncoder)
}
