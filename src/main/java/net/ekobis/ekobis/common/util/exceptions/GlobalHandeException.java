package net.ekobis.ekobis.common.util.exceptions;

import net.ekobis.ekobis.common.util.response.helper.ResponseHelper;
import net.ekobis.ekobis.inventory.model.util.exceptions.DeletedProductException;
import net.ekobis.ekobis.inventory.model.util.exceptions.NotFoundProductId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalHandeException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> handleValidationErrors(MethodArgumentNotValidException e) {
        List<String> errorList = e.getBindingResult().getFieldErrors().stream().map(FieldError::getDefaultMessage).toList();
        return new ResponseEntity<>(errorList,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundProductId.class)
    public ResponseEntity<?> handeNotFound() {
        return new ResponseEntity<>(ResponseHelper.NOT_FOUND_PRODUCT_ID(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DeletedProductException.class)
    public ResponseEntity<?> handleDeletedProductException() {
        return new ResponseEntity<>(ResponseHelper.DELETED_PRODUCT_ID(), HttpStatus.BAD_REQUEST);
    }
}
