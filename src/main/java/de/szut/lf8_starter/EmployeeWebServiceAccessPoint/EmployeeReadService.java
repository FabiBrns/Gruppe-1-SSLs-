package de.szut.lf8_starter.EmployeeWebServiceAccessPoint;

import de.szut.lf8_starter.EmployeeWebServiceAccessPoint.Dtos.GetEmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReadService extends BaseReadService<GetEmployeeDto, Long>{

    public EmployeeReadService(AccessTokenRetrieverService accessTokenRetrieverService) {
        super("https://employee.szut.dev", accessTokenRetrieverService, GetEmployeeDto.class, GetEmployeeDto[].class);
    }

    @Override
    protected String getEndpoint() {
        return "employees";
    }
}
