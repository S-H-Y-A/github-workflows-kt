// File auto-generated by :gradlew wrapper-generator:run
@file:Suppress("ObjectPropertyNaming")

package it.krzeminski.githubactions.dsl.expressions.contexts

import it.krzeminski.githubactions.dsl.expressions.FakeList
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

public object ReleaseEventReleaseAuthor {
    public const val login: String = "github.event.release.author.login"

    public const val id: String = "github.event.release.author.id"

    public const val node_id: String = "github.event.release.author.node_id"

    public const val avatar_url: String = "github.event.release.author.avatar_url"

    public const val gravatar_id: String = "github.event.release.author.gravatar_id"

    public const val url: String = "github.event.release.author.url"

    public const val html_url: String = "github.event.release.author.html_url"

    public const val followers_url: String = "github.event.release.author.followers_url"

    public const val following_url: String = "github.event.release.author.following_url"

    public const val gists_url: String = "github.event.release.author.gists_url"

    public const val starred_url: String = "github.event.release.author.starred_url"

    public const val subscriptions_url: String = "github.event.release.author.subscriptions_url"

    public const val organizations_url: String = "github.event.release.author.organizations_url"

    public const val repos_url: String = "github.event.release.author.repos_url"

    public const val events_url: String = "github.event.release.author.events_url"

    public const val received_events_url: String = "github.event.release.author.received_events_url"

    public const val type: String = "github.event.release.author.type"

    public const val site_admin: String = "github.event.release.author.site_admin"
}

public object ReleaseEventRelease {
    public const val url: String = "github.event.release.url"

    public const val assets_url: String = "github.event.release.assets_url"

    public const val upload_url: String = "github.event.release.upload_url"

    public const val html_url: String = "github.event.release.html_url"

    public const val id: String = "github.event.release.id"

    public const val node_id: String = "github.event.release.node_id"

    public const val tag_name: String = "github.event.release.tag_name"

    public const val target_commitish: String = "github.event.release.target_commitish"

    public const val name: String = "github.event.release.name"

    public const val draft: String = "github.event.release.draft"

    public val author: ReleaseEventReleaseAuthor = ReleaseEventReleaseAuthor

    public const val prerelease: String = "github.event.release.prerelease"

    public const val created_at: String = "github.event.release.created_at"

    public const val published_at: String = "github.event.release.published_at"

    public val assets: List<String> = FakeList("github.event.release.assets")

    public const val tarball_url: String = "github.event.release.tarball_url"

    public const val zipball_url: String = "github.event.release.zipball_url"

    public const val body: String = "github.event.release.body"
}

public object ReleaseEventRepositoryOwner {
    public const val login: String = "github.event.repository.owner.login"

    public const val id: String = "github.event.repository.owner.id"

    public const val node_id: String = "github.event.repository.owner.node_id"

    public const val avatar_url: String = "github.event.repository.owner.avatar_url"

    public const val gravatar_id: String = "github.event.repository.owner.gravatar_id"

    public const val url: String = "github.event.repository.owner.url"

    public const val html_url: String = "github.event.repository.owner.html_url"

    public const val followers_url: String = "github.event.repository.owner.followers_url"

    public const val following_url: String = "github.event.repository.owner.following_url"

    public const val gists_url: String = "github.event.repository.owner.gists_url"

    public const val starred_url: String = "github.event.repository.owner.starred_url"

    public const val subscriptions_url: String = "github.event.repository.owner.subscriptions_url"

    public const val organizations_url: String = "github.event.repository.owner.organizations_url"

    public const val repos_url: String = "github.event.repository.owner.repos_url"

    public const val events_url: String = "github.event.repository.owner.events_url"

    public const val received_events_url: String = "github.event.repository.owner.received_events_url"

    public const val type: String = "github.event.repository.owner.type"

    public const val site_admin: String = "github.event.repository.owner.site_admin"
}

public object ReleaseEventRepository {
    public const val id: String = "github.event.repository.id"

    public const val node_id: String = "github.event.repository.node_id"

    public const val name: String = "github.event.repository.name"

    public const val full_name: String = "github.event.repository.full_name"

    public const val `private`: String = "github.event.repository.private"

    public val owner: ReleaseEventRepositoryOwner = ReleaseEventRepositoryOwner

    public const val html_url: String = "github.event.repository.html_url"

    public const val description: String = "github.event.repository.description"

    public const val fork: String = "github.event.repository.fork"

    public const val url: String = "github.event.repository.url"

    public const val forks_url: String = "github.event.repository.forks_url"

    public const val keys_url: String = "github.event.repository.keys_url"

    public const val collaborators_url: String = "github.event.repository.collaborators_url"

    public const val teams_url: String = "github.event.repository.teams_url"

    public const val hooks_url: String = "github.event.repository.hooks_url"

    public const val issue_events_url: String = "github.event.repository.issue_events_url"

    public const val events_url: String = "github.event.repository.events_url"

    public const val assignees_url: String = "github.event.repository.assignees_url"

    public const val branches_url: String = "github.event.repository.branches_url"

    public const val tags_url: String = "github.event.repository.tags_url"

    public const val blobs_url: String = "github.event.repository.blobs_url"

    public const val git_tags_url: String = "github.event.repository.git_tags_url"

    public const val git_refs_url: String = "github.event.repository.git_refs_url"

    public const val trees_url: String = "github.event.repository.trees_url"

    public const val statuses_url: String = "github.event.repository.statuses_url"

    public const val languages_url: String = "github.event.repository.languages_url"

    public const val stargazers_url: String = "github.event.repository.stargazers_url"

    public const val contributors_url: String = "github.event.repository.contributors_url"

    public const val subscribers_url: String = "github.event.repository.subscribers_url"

    public const val subscription_url: String = "github.event.repository.subscription_url"

    public const val commits_url: String = "github.event.repository.commits_url"

    public const val git_commits_url: String = "github.event.repository.git_commits_url"

    public const val comments_url: String = "github.event.repository.comments_url"

    public const val issue_comment_url: String = "github.event.repository.issue_comment_url"

    public const val contents_url: String = "github.event.repository.contents_url"

    public const val compare_url: String = "github.event.repository.compare_url"

    public const val merges_url: String = "github.event.repository.merges_url"

    public const val archive_url: String = "github.event.repository.archive_url"

    public const val downloads_url: String = "github.event.repository.downloads_url"

    public const val issues_url: String = "github.event.repository.issues_url"

    public const val pulls_url: String = "github.event.repository.pulls_url"

    public const val milestones_url: String = "github.event.repository.milestones_url"

    public const val notifications_url: String = "github.event.repository.notifications_url"

    public const val labels_url: String = "github.event.repository.labels_url"

    public const val releases_url: String = "github.event.repository.releases_url"

    public const val deployments_url: String = "github.event.repository.deployments_url"

    public const val created_at: String = "github.event.repository.created_at"

    public const val updated_at: String = "github.event.repository.updated_at"

    public const val pushed_at: String = "github.event.repository.pushed_at"

    public const val git_url: String = "github.event.repository.git_url"

    public const val ssh_url: String = "github.event.repository.ssh_url"

    public const val clone_url: String = "github.event.repository.clone_url"

    public const val svn_url: String = "github.event.repository.svn_url"

    public const val homepage: String = "github.event.repository.homepage"

    public const val size: String = "github.event.repository.size"

    public const val stargazers_count: String = "github.event.repository.stargazers_count"

    public const val watchers_count: String = "github.event.repository.watchers_count"

    public const val language: String = "github.event.repository.language"

    public const val has_issues: String = "github.event.repository.has_issues"

    public const val has_projects: String = "github.event.repository.has_projects"

    public const val has_downloads: String = "github.event.repository.has_downloads"

    public const val has_wiki: String = "github.event.repository.has_wiki"

    public const val has_pages: String = "github.event.repository.has_pages"

    public const val forks_count: String = "github.event.repository.forks_count"

    public const val mirror_url: String = "github.event.repository.mirror_url"

    public const val archived: String = "github.event.repository.archived"

    public const val disabled: String = "github.event.repository.disabled"

    public const val open_issues_count: String = "github.event.repository.open_issues_count"

    public const val license: String = "github.event.repository.license"

    public const val forks: String = "github.event.repository.forks"

    public const val open_issues: String = "github.event.repository.open_issues"

    public const val watchers: String = "github.event.repository.watchers"

    public const val default_branch: String = "github.event.repository.default_branch"
}

public object ReleaseEventSender {
    public const val login: String = "github.event.sender.login"

    public const val id: String = "github.event.sender.id"

    public const val node_id: String = "github.event.sender.node_id"

    public const val avatar_url: String = "github.event.sender.avatar_url"

    public const val gravatar_id: String = "github.event.sender.gravatar_id"

    public const val url: String = "github.event.sender.url"

    public const val html_url: String = "github.event.sender.html_url"

    public const val followers_url: String = "github.event.sender.followers_url"

    public const val following_url: String = "github.event.sender.following_url"

    public const val gists_url: String = "github.event.sender.gists_url"

    public const val starred_url: String = "github.event.sender.starred_url"

    public const val subscriptions_url: String = "github.event.sender.subscriptions_url"

    public const val organizations_url: String = "github.event.sender.organizations_url"

    public const val repos_url: String = "github.event.sender.repos_url"

    public const val events_url: String = "github.event.sender.events_url"

    public const val received_events_url: String = "github.event.sender.received_events_url"

    public const val type: String = "github.event.sender.type"

    public const val site_admin: String = "github.event.sender.site_admin"
}

public object ReleaseEvent {
    public const val action: String = "github.event.action"

    public val release: ReleaseEventRelease = ReleaseEventRelease

    public val repository: ReleaseEventRepository = ReleaseEventRepository

    public val sender: ReleaseEventSender = ReleaseEventSender
}