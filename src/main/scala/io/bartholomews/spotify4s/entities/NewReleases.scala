package io.bartholomews.spotify4s.entities

import io.circe.Decoder
import io.circe.generic.extras.semiauto.deriveConfiguredDecoder

case class NewReleases(albums: Page[SimpleAlbum])

object NewReleases {
  implicit val decoder: Decoder[NewReleases] = deriveConfiguredDecoder
}
