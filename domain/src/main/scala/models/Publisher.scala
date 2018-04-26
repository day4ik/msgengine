package models

import java.time.LocalDateTime

case class Publisher(
                      id: Publisher.ID,
                      name: String,
                      description: Option[String],
                      budget: Int,
                      registeredAt: LocalDateTime,
                      website: Option[String],
                      isDeleted: Boolean
)
object Publisher {
  type ID = Int
}