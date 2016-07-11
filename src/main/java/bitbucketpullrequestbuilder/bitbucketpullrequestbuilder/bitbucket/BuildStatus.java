package bitbucketpullrequestbuilder.bitbucketpullrequestbuilder.bitbucket;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * POJO representing the pull-requests extracted from the
 * JSON response of the Bitbucket API V2.
 *
 * @see https://confluence.atlassian.com/bitbucket/buildstatus-resource-779295267.html
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildStatus {

    private String name;
    private String url;
    private String createdOn;
    private String state;
    private String key;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return this.createdOn;
    }

    @JsonProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonProperty("key")
    public String getKey() {
        return this.key;
    }
}
