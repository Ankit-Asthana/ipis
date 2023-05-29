// package org.example.exceptionhandling;

// import com.fasterxml.jackson.databind.exc.InvalidFormatException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.validation.ConstraintViolationException;
// import org.springframework.boot.json.JsonParseException;
// import org.springframework.core.Ordered;
// import org.springframework.core.annotation.Order;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.MethodArgumentNotValidException;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import java.nio.file.AccessDeniedException;
// import java.time.LocalDateTime;
// import java.util.UUID;


// @ControllerAdvice
// @Order(Ordered.HIGHEST_PRECEDENCE)
// public class GlobalExceptionHandler {


//     @ExceptionHandler(NullPointerException.class)
//     public ResponseEntity<?> handleNullPointerException(NullPointerException exception, HttpServletRequest
//             request) {
//         HttpStatus status = HttpStatus.BAD_REQUEST;
//         String errorCode = "null pointer";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }
//     @ExceptionHandler(IllegalArgumentException.class)
//     public ResponseEntity<?> handleIllegalArgument(IllegalArgumentException exception, HttpServletRequest
//             request) {
//         HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
//         String errorCode = "arguments invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }

//     @ExceptionHandler(MethodArgumentNotValidException.class)
//     public ResponseEntity<?> handleMethodArgumentNotValid(IllegalArgumentException exception,
//                                                           HttpServletRequest request) {
//         HttpStatus status = HttpStatus.METHOD_NOT_ALLOWED;
//         String errorCode = "method argument invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());

//         return new ResponseEntity<>(error, status);
//     }

//     @ExceptionHandler(JsonParseException.class)
//     public ResponseEntity<?> httpMessage(JsonParseException exception, HttpServletRequest request) {
//         HttpStatus status = HttpStatus.METHOD_NOT_ALLOWED;
//         String errorCode = "arguments invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }

//     @ExceptionHandler(AccessDeniedException.class)
//     public ResponseEntity<?> handleAccessDeniedException(IllegalArgumentException exception,
//                                                          HttpServletRequest request) {
//         HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
//         String errorCode = "arguments invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }
//     @ExceptionHandler(ConstraintViolationException.class)
//     public ResponseEntity<?> handleConstraintViolation(IllegalArgumentException exception, HttpServletRequest
//             request) {
//         HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
//         String errorCode = "arguments invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }
//     @ExceptionHandler(InvalidFormatException.class)
//     public ResponseEntity<?> handleInvalidFormat(IllegalArgumentException exception, HttpServletRequest
//             request) {
//         HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
//         String errorCode = "arguments invalid";
//         String message = exception.getMessage();
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }

//     @ExceptionHandler(Throwable.class)
//     public ResponseEntity<ErrorAttributes> handleThrowable(Throwable ex, HttpServletRequest request) {
//         HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
//         String errorCode = "General Error";
//         String message = "Something Went Wrong";
//         String path = request.getRequestURI();
//         String method = request.getMethod();
//         String guid = UUID.randomUUID().toString();
//         ErrorAttributes error = new ErrorAttributes(guid, errorCode, message, status.value(), status.name(), path,
//                 method, LocalDateTime.now());
//         return new ResponseEntity<>(error, status);
//     }
// }
