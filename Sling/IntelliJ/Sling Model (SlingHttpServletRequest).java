#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
@Model( adaptables = SlingHttpServletRequest.class )
public class ${NAME} {

    @Inject
    private SlingHttpServletRequest request;
}
