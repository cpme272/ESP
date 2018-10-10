package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountSettings {

@SerializedName("always_use_https")
@Expose
private Boolean alwaysUseHttps;
@SerializedName("discoverable_by_email")
@Expose
private Boolean discoverableByEmail;
@SerializedName("geo_enabled")
@Expose
private Boolean geoEnabled;
@SerializedName("language")
@Expose
private String language;
@SerializedName("protected")
@Expose
private Boolean _protected;
@SerializedName("screen_name")
@Expose
private String screenName;
@SerializedName("show_all_inline_media")
@Expose
private Boolean showAllInlineMedia;

private Boolean useCookiePersonalization;
@SerializedName("allow_contributor_request")
@Expose
private String allowContributorRequest;

public Boolean getAlwaysUseHttps() {
return alwaysUseHttps;
}

public void setAlwaysUseHttps(Boolean alwaysUseHttps) {
this.alwaysUseHttps = alwaysUseHttps;
}

public AccountSettings withAlwaysUseHttps(Boolean alwaysUseHttps) {
this.alwaysUseHttps = alwaysUseHttps;
return this;
}

public Boolean getDiscoverableByEmail() {
return discoverableByEmail;
}

public void setDiscoverableByEmail(Boolean discoverableByEmail) {
this.discoverableByEmail = discoverableByEmail;
}

public AccountSettings withDiscoverableByEmail(Boolean discoverableByEmail) {
this.discoverableByEmail = discoverableByEmail;
return this;
}

public Boolean getGeoEnabled() {
return geoEnabled;
}

public void setGeoEnabled(Boolean geoEnabled) {
this.geoEnabled = geoEnabled;
}

public AccountSettings withGeoEnabled(Boolean geoEnabled) {
this.geoEnabled = geoEnabled;
return this;
}

public String getLanguage() {
return language;
}

public void setLanguage(String language) {
this.language = language;
}

public AccountSettings withLanguage(String language) {
this.language = language;
return this;
}

public Boolean getProtected() {
return _protected;
}

public void setProtected(Boolean _protected) {
this._protected = _protected;
}

public AccountSettings withProtected(Boolean _protected) {
this._protected = _protected;
return this;
}

public String getScreenName() {
return screenName;
}

public void setScreenName(String screenName) {
this.screenName = screenName;
}

public AccountSettings withScreenName(String screenName) {
this.screenName = screenName;
return this;
}

public Boolean getShowAllInlineMedia() {
return showAllInlineMedia;
}

public void setShowAllInlineMedia(Boolean showAllInlineMedia) {
this.showAllInlineMedia = showAllInlineMedia;
}

public AccountSettings withShowAllInlineMedia(Boolean showAllInlineMedia) {
this.showAllInlineMedia = showAllInlineMedia;
return this;
}

public Boolean getUseCookiePersonalization() {
return useCookiePersonalization;
}

public void setUseCookiePersonalization(Boolean useCookiePersonalization) {
this.useCookiePersonalization = useCookiePersonalization;
}

public AccountSettings withUseCookiePersonalization(Boolean useCookiePersonalization) {
this.useCookiePersonalization = useCookiePersonalization;
return this;
}

public String getAllowContributorRequest() {
return allowContributorRequest;
}

public void setAllowContributorRequest(String allowContributorRequest) {
this.allowContributorRequest = allowContributorRequest;
}

public AccountSettings withAllowContributorRequest(String allowContributorRequest) {
this.allowContributorRequest = allowContributorRequest;
return this;
}

}