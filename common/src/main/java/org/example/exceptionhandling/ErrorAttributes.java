// package org.example.exceptionhandling;

// import org.apache.commons.lang3.builder.ToStringBuilder;

// import java.time.LocalDateTime;


// /**
//  * This record encapsulates a server-side error into a standardized object that can be serialized
//  * back to the client as JSON.
//  */
// public record ErrorAttributes(
//         String guid,
//         String errorCode,
//         String message,
//         Integer statusCode,
//         String statusName,
//         String path,
//         String method,
//         LocalDateTime timestamp) {



//     @Override
//     public String toString() {
//         return new ToStringBuilder(this)
//                 .append("guid", guid)
//                 .append("errorCode", errorCode)
//                 .append("message", message)
//                 .append("statusCode", statusCode)
//                 .append("statusName", statusName)
//                 .append("path", path)
//                 .append("method", method)
//                 .append("timestamp", timestamp)
//                 .toString();
//     }
// }
