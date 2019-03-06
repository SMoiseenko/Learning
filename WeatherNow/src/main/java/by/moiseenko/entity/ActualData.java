package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActualData {
  @JsonProperty("EffectiveDate")
  private String effectiveDate;

  @JsonProperty("EffectiveEpochDate")
  private long effectiveEpochDate;

  @JsonProperty("Severity")
  private int severity;

  @JsonProperty("Text")
  private String text;

  @JsonProperty("Category")
  private String category;

  @JsonProperty("EndDate")
  private String endDate;

  @JsonProperty("EndEpochDate")
  private long endEpochDate;

  @JsonProperty("MobileLink")
  private String mobileLink;

  @JsonProperty("Link")
  private String link;

  public ActualData() {}

  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public long getEffectiveEpochDate() {
    return effectiveEpochDate;
  }

  public void setEffectiveEpochDate(long effectiveEpochDate) {
    this.effectiveEpochDate = effectiveEpochDate;
  }

  public int getSeverity() {
    return severity;
  }

  public void setSeverity(int severity) {
    this.severity = severity;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public long getEndEpochDate() {
    return endEpochDate;
  }

  public void setEndEpochDate(long endEpochDate) {
    this.endEpochDate = endEpochDate;
  }

  public String getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public String toString() {
    return "ActualData{"
        + "effectiveDate='"
        + effectiveDate
        + '\''
        + ", effectiveEpochDate="
        + effectiveEpochDate
        + ", severity="
        + severity
        + ", text='"
        + text
        + '\''
        + ", category='"
        + category
        + '\''
        + ", endDate='"
        + endDate
        + '\''
        + ", endEpochDate="
        + endEpochDate
        + ", mobileLink='"
        + mobileLink
        + '\''
        + ", link='"
        + link
        + '\''
        + '}';
  }
}
