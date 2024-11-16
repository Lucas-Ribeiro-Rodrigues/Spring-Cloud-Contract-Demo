package contracts

import org.springframework.cloud.contract.spec.ContractDsl.Companion.contract

contract {
    request {
        method = DELETE
        url = url("/api/v1/demo/f47ac10b-58cc-4372-a567-0e02b2c3d479")
    }
    response {
        status = NO_CONTENT
    }
}