/**
 * This code is generated using sbt-datatype.
 */

// DO NOT EDIT MANUALLY
package sbt.protocol.codec
trait JsonProtocol extends sjsonnew.BasicJsonProtocol
  with sbt.protocol.codec.ExecCommandFormats
  with sbt.protocol.codec.CommandMessageFormats
  with sbt.protocol.codec.ChannelAcceptedEventFormats
  with sbt.protocol.codec.LogEventFormats
  with sbt.protocol.codec.ExecStatusEventFormats
  with sbt.protocol.codec.EventMessageFormats
  with sbt.protocol.codec.ExecutionEventFormats
object JsonProtocol extends JsonProtocol