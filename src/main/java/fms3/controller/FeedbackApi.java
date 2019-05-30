/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package fms3.controller;

import fms3.model.ErrorResponse;
import fms3.model.Feedback;
import fms3.model.FeedbackInput;
import fms3.model.SuccessfulResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-30T14:52:04.446Z")

@Api(value = "feedback", description = "the feedback API")
public interface FeedbackApi {

    @ApiOperation(value = "Add a new feedback to the store", nickname = "createFeedback", notes = "", response = SuccessfulResponse.class, tags={ "Feedback", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response", response = SuccessfulResponse.class),
        @ApiResponse(code = 400, message = "Invalid input", response = ErrorResponse.class) })
    @RequestMapping(value = "/feedback",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SuccessfulResponse> createFeedback(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody FeedbackInput body);


    @ApiOperation(value = "Update an existing pet", nickname = "getFeedback", notes = "", response = Feedback.class, responseContainer = "List", tags={ "Feedback", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response", response = Feedback.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Invalid Response") })
    @RequestMapping(value = "/feedback",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Feedback>> getFeedback();

}
